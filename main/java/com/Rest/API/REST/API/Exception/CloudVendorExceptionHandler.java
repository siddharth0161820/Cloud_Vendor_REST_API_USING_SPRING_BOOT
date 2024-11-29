package com.Rest.API.REST.API.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
 @ControllerAdvice
public class CloudVendorExceptionHandler {

    //1> Add handler method to handle cloud vendor not found exceptions
    @ExceptionHandler(value = {CloudVendorNotFoundException.class})
    public ResponseEntity<Object>
    handleCloudVendorNotFoundException(CloudVendorNotFoundException cloudVendorNotFoundException){

        //create payload which will be returned back in
        // terms of ResponseEntity and that expection messge will be given to client

        //create obj for cloudvendorexception
        CloudVendorException cloudVendorException =
                new CloudVendorException(cloudVendorNotFoundException.getMessage(),
                        cloudVendorNotFoundException.getCause(), HttpStatus.NOT_FOUND);
        return  new ResponseEntity<>(cloudVendorException,HttpStatus.NOT_FOUND);
    }
}
