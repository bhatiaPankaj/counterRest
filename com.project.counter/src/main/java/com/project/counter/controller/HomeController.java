package com.project.counter.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.counter.exceptionHandler.CounterServiceException;
import com.project.counter.model.Count;
import com.project.counter.service.CounterService;

/**
 * This class handles all the requests from the client and routes the control to
 * underlying layers
 * 
 * @author Pankaj
 *
 */
@RestController
public class HomeController {
	/**
	 * This element binds the counterService which is the depending property in the
	 * controller
	 * 
	 */
	@Autowired
	CounterService counterService;
	/**
	 * This element binds the model object of the Count which is required for
	 * setting the data
	 */
	@Autowired
	Count count;

	Logger log = Logger.getLogger(HomeController.class);

	/**
	 * This method handles the multiple reequests for incrementcounter logic and
	 * performs routing to the underlying service layers
	 * 
	 * @return String as the response back to the client
	 * @throws CounterServiceException Custom exception that could occur in
	 *                                 underlying layers
	 */
	@RequestMapping(value = "/incrementcounter", method = RequestMethod.GET)
	public synchronized String incrementcounter() throws CounterServiceException {
		log.info("inside incrementcounter controller ");
		int currentCount = counterService.getCounter();
		int updatedCount = currentCount + 1;
		counterService.addCounter(updatedCount);
		log.info("controller: newNum is " + "\n" + updatedCount);
		return "success for number " + updatedCount;
	}

}
