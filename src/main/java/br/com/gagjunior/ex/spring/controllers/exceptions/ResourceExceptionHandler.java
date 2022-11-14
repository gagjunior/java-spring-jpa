package br.com.gagjunior.ex.spring.controllers.exceptions;

import br.com.gagjunior.ex.spring.services.exceptions.ResourceNotFoudException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoudException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoudException error, HttpServletRequest request) {
        String errorMsg = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(Instant.now(), status.value(), errorMsg, error.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(standardError);
    }
}
