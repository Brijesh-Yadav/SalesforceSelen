package com.salesforce.exception;

public class ButtonDisabledException extends SdriverException{
	
    public ButtonDisabledException() {
        super();
    }

    public ButtonDisabledException(String message) {
        super(message);
    }

    public ButtonDisabledException(String message, Throwable cause) {
        super(message, cause);
    }

    public ButtonDisabledException(Throwable cause) {
        super(cause);
    }


}
