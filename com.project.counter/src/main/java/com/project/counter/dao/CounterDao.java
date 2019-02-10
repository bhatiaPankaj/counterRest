package com.project.counter.dao;

import com.project.counter.exceptionHandler.CounterDaoException;
import com.project.counter.exceptionHandler.CounterServiceException;
/**
 * This interface defines the methods to be implemented  by the persistence layer
 * The interface is used to provide lose coupling between the layers.
 * @author Pankaj
 *
 */
public interface CounterDao {
	/**
	 * The method definition is for getting the stored number in the database
	 * @throws CounterDaoException to throw the exception while fetching the counter from 
	 * database.
	 */
	public void incrementCounter() throws CounterDaoException;

	
}
