package com.palma.gestioneprenotazioni.model;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @AllArgsConstructor @Builder
public class ApiError {
	private String message;
	private HttpStatus status;
}

