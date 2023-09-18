package com.test.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.rest.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{
	
	@Query(value = "SELECT * FROM country;", nativeQuery = true)
	List<Country> listar_paises();
		
}
