package com.lambdaschool.schools.exceptions;

import com.lambdaschool.schools.models.ErrorDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super("Found an issue with School: " + message);
    }
}
