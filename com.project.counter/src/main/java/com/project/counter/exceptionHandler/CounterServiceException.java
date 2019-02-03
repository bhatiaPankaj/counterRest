package com.project.counter.exceptionHandler;

/**
 * This class contains the methods to handle the exceptions at Service layer of
 * the code
 * 
 * @author Pankaj
 *
 */
public class CounterServiceException extends CounterControllerException {
	/**
	 * This method handles the underlying exceptions at service layer
	 * 
	 * @param message This contains the message shown at the error
	 * @param cause   This contains the underlying cause of the error
	 */
	public CounterServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
