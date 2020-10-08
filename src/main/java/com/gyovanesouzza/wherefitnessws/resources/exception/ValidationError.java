package com.gyovanesouzza.wherefitnessws.resources.exception;

import com.gyovanesouzza.wherefitnessws.resources.exception.StandardError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;

	private List<com.gyovanesouzza.springboost.resources.exception.FieldMessage> error = new ArrayList<com.gyovanesouzza.springboost.resources.exception.FieldMessage>();

	public ValidationError(Long timeStamp, Integer status, String error, String message, String path) {
		super(timeStamp, status, error, message, path);
	}

	public void addError(String fieldName, String messagem) {
		error.add(new com.gyovanesouzza.springboost.resources.exception.FieldMessage(fieldName, messagem));
	}

}
