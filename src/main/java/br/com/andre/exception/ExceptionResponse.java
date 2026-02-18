package br.com.andre.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String Message, String details) {
}