package com.project.counter.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.counter.dao.CounterDao;
import com.project.counter.exceptionHandler.CounterServiceException;
import com.project.counter.model.Count;

/**
 * This class works on the business logic level and calls the dao layer for
 * databse transactions
 * 
 * @author Pankaj
 */
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
@Component
public class CounterService {

	/**
	 * This parameter binds the Count model object where the counter value is set
	 */
	@Autowired
	Count count;
	/**
	 * This parameter binds the Dao object where the incremented counter value is
	 * set
	 */
	@Autowired
	CounterDao counterDao;

	Logger log = Logger.getLogger(CounterService.class);

	/**
	 * This method calls the underlying dao layer to fetch the existing counter
	 * value
	 * 
	 * @return It returns the integer existing in the database
	 * @throws CounterServiceException It is the custom exception thrown at this
	 *                                 level.
	 */
	public int getCounter() throws CounterServiceException {
		log.info("inside getCounter Service ");
		int numNow;
		numNow = counterDao.getCounter();
		log.info("exiting getCounter Service ");
		return numNow;

	}

	/**
	 * This method underlying dao layer to add the incremented number to the databse
	 * 
	 * @param num It takes in the value of the incremented counter
	 * @throws CounterServiceException It is the custom exception thrown in case of
	 *                                 error at this level
	 */
	public void addCounter(int num) throws CounterServiceException {
		log.info("inside addCounter Service ");
		counterDao.incrementCounter(num);
	}

}
