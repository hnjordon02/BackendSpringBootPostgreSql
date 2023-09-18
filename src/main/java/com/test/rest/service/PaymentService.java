package com.test.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.rest.model.Payment;
import com.test.rest.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public List<Payment> obtenerResumenAlquiler(String fechaIni, String fechaFin) {
        return paymentRepository.listar(fechaIni,fechaFin);
    }
}
