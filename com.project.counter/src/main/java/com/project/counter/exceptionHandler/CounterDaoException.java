package com.project.counter.exceptionHandler;

/**
 * This class contains the methods handling the errors at Persistence level
 * 
 * @author Pankaj
 *
 */
public class CounterDaoException extends CounterServiceException {
	/**
	 * This method handles the exceptions at Dao layer
	 * 
	 * @param message This contains the message shown at the error
	 * @param cause   This contains the underlying cause of the error
	 */
	public CounterDaoException(String message, Throwable cause) {
		super(message, cause);
	}

}
