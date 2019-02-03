package com.project.counter.exceptionHandler;

/**
 * The class contains methods handling the exceptions occuring at Controller
 * level
 * @author Pankaj
 */
public class CounterControllerException extends Exception {

	/**
	 * This method handles the Exceptions at Controller level
	 * @param message This is the message thrown by the underlying error
	 * @param cause   This is the appended caue of the underlying error
	 */
	public CounterControllerException(String message, Throwable cause) {
		super(message, cause);
	}

}
