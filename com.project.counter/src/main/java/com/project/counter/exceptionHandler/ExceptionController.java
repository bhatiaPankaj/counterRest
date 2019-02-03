
package com.project.counter.exceptionHandler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This class handles the exceptions occuring at corresponding levels of the API
 * 
 * @author Pankaj
 *
 */
@ControllerAdvice
public class ExceptionController {

	/**
	 * This method handles the exceptions occuring at the Dao layer
	 * 
	 * @param exception It takes in the exception object thrown at underlying layers
	 * @return It returns the string which needs to be returned in the result in case of error
	 */
	@ExceptionHandler(value = CounterDaoException.class)
	public String handleCounterDaoException(Exception exception) {
		return "Some issues in the API" + " at Dao level " + " error being : " + exception.getMessage();
	}

	/**
	 * This method handles the exceptions occuring at the Service layer
	 * 
	 * @param exception It takes in the exception object thrown at underlying layers
	 * @return It returns the string which needs to be returned in the result in case of error
	 */
	@ExceptionHandler(value = CounterServiceException.class)
	public String handleCounterServiceException(Exception exception) {
		return "Some issues in the API" + " at Service level " + " error being : " + exception.getMessage();
	}

	/**
	 * This method handles the exceptions occuring at the Controller layer
	 * 
	 * @param exception It takes in the exception object thrown at underlying layers
	 * @return It returns the string which needs to be returned in the result in case of error
	 */
	@ExceptionHandler(value = CounterControllerException.class)
	public String handleCounterControllerException(Exception exception) {
		return "Some issues in the API" + " at Controller level " + " error being : " + exception.getMessage();
	}

	/**
	 * This method handles the any other exception
	 * 
	 * @param exception It takes in the exception object thrown at underlying layers
	 * @return It returns the string which needs to be returned in the result in case of error
	 */
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception exception) {
		return "Some issues in the API" + " error being: " + exception.getMessage();
	}

}
