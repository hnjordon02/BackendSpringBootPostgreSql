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
public class Payment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "payment_id")
	private Integer payment_id;
	
	@Column(name = "full_name")
	private String fullname;
	
	@Column(name = "staff_id")
	private Integer staff_id;
	
	@Column(name = "rental_id")
	private Integer rental_id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "amount")
	private String amount;
	
	@Column(name = "payment_date")
	@JsonFormat(shape = Shape.STRING,pattern = "dd/MM/yyyy HH:mm:ss")
	private LocalDateTime payment_date;
	
}
