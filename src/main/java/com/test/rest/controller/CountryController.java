package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.model.ApiResponse;
import com.test.rest.model.Country;
import com.test.rest.service.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {

	@Autowired
	CountryService countryService;
	
	@GetMapping("/")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<ApiResponse> getCountry () {
		List<Country> data = countryService.listar_paises();
		ApiResponse response = new ApiResponse("ok",HttpStatus.OK.value(),data); 
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	/*POST PARA REGISTRO DE UN NUEVO PAIS*/
	@PostMapping("/newCountry")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<ApiResponse> createCountry (@RequestBody Country country){
		Country createdCountry = countryService.createCountry(country);
		ApiResponse response = new ApiResponse("ok", HttpStatus.CREATED.value(),createdCountry);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
}
