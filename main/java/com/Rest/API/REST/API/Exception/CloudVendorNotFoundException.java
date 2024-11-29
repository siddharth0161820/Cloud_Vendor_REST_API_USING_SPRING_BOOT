package com.Rest.API.REST.API.Exception;

public class CloudVendorNotFoundException extends RuntimeException{

    //1>Create constructor1 for CloudVendorNotFoundException with arg as message
    public CloudVendorNotFoundException(String message) {
        super(message);
    }
    //1>Create constructor2 for CloudVendorNotFoundException with arg as message,throwable cause
    public CloudVendorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
