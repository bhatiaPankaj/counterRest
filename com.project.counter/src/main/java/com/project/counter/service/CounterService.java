package com.project.counter.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.project.counter.dao.CounterDao;
import com.project.counter.model.Count;

@Transactional (readOnly = false, propagation = Propagation.REQUIRES_NEW, isolation = Isolation.SERIALIZABLE)
@Component
public class CounterService {

	@Autowired
	Count count;
	@Autowired
	CounterDao counterDao;

	Logger log = Logger.getLogger(CounterService.class);

	public int getCounter() {
		log.info("inside getCounter Service ");
		int numNow;
		numNow = counterDao.getCounter();
		log.info("exiting getCounter Service ");
		return numNow;

	}

	public int addCounter(int num) {
		log.info("inside addCounter Service ");
		return counterDao.incrementCounter(num);
	}

}
