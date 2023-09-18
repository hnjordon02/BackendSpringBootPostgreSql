package com.test.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rest.model.Payment;
import com.test.rest.model.Fechas;
import com.test.rest.service.PaymentService;

@RestController
@RequestMapping("/api")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Payment> listarAlquileres(@RequestBody Fechas request){
		String fechaIni= request.getFechaIni();
		String fechaFin = request.getFechaFin();
		List<Payment> resumen = paymentService.obtenerResumenAlquiler(fechaIni, fechaFin);
		return resumen;
	}
}
