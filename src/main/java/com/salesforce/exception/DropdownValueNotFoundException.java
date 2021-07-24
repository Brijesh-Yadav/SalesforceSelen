package com.salesforce.exception;

public class DropdownValueNotFoundException extends SdriverException{
	
    public DropdownValueNotFoundException() {
        super();
    }

    public DropdownValueNotFoundException(String message) {
        super(message);
    }

    public DropdownValueNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DropdownValueNotFoundException(Throwable cause) {
        super(cause);
    }


}
