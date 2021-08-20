package com.addressBook.Error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.addressBook.entity.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class ExceptionHandler extends ResponseEntityExceptionHandler {
@org.springframework.web.bind.annotation.ExceptionHandler(AddressBookNotFound.class)
	public ResponseEntity<ErrorMessage> AddressBookNotFoundException(AddressBookNotFound exception,WebRequest request) {
		ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());
return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
}
	 
}
