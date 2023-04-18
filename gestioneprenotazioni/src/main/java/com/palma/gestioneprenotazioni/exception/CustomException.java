//package com.palma.gestioneprenotazioni.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import com.palma.gestioneprenotazioni.runners.EpicException;
//
//import jakarta.persistence.EntityNotFoundException;
//
//@ControllerAdvice
//public class CustomException extends ResponseEntityExceptionHandler{
//	@ExceptionHandler(EpicException.class)
//	protected ResponseEntity <Object> handleEpicException(EpicException e){
//		ApiError apiError = new ApiError(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//		return buildResponseEntity(apiError);
//	}
//}
