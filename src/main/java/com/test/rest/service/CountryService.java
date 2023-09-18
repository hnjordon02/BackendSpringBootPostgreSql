package com.test.rest.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.model.Country;
import com.test.rest.repository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	CountryRepository countryRepository;
	
	public List<Country> listar_paises(){
		return countryRepository.listar_paises();
	}
	
	public Country createCountry(Country country) {
		country.setLast_update(LocalDateTime.now());
		return countryRepository.save(country);
	}

}
