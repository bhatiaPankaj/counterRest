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
	 * @return the counter existing in the databse
	 * @throws CounterDaoException to throw the exception while fetching the counter from 
	 * database.
	 */
	public int getCounter() throws CounterDaoException;
	/**
	 * 
	 * @param newCounter It takes in incremented value of the counter to add in the database
	 * @throws CounterDaoException to handle the underlying persistence exception
	 */
	public void incrementCounter(int newCounter) throws CounterDaoException;
	
}
