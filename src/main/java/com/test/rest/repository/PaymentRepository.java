package com.test.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.test.rest.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	//@Query(value = "SELECT * FROM resumen_alquiler(:fechaIniParam::TIMESTAMP, :fechaFinParam::TIMESTAMP)",nativeQuery = true)
	@Query(nativeQuery = true, value = "SELECT * FROM resumen_alquiler(to_date(:fechaIniParam, 'YYYY-MM-DD'), to_date(:fechaFinParam, 'YYYY-MM-DD'))")
	List<Payment> listar(@Param("fechaIniParam") String fechaIni,
						 @Param("fechaFinParam") String fechaFin);
	
}
