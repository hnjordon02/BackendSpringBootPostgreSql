package com.test.rest.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ApiResponse {
	private String status;
	private Integer codeStatus;
	private Object data;
}
