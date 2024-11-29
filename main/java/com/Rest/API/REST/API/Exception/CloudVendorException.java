package com.Rest.API.REST.API.Exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    //1>Attributes
    private  final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    //2> constructor for all the attributes..
    public CloudVendorException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    //3>Getter

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
