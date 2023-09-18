package com.test.rest.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Country {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "country_id")
	private Integer country_id;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "last_update")
	@JsonFormat(shape = Shape.STRING,pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime last_update;

}
