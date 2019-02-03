package com.project.counter.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.counter.model.Count;
import com.project.counter.service.CounterService;




@RestController
	public class HomeController {
	
	@Autowired
	CounterService counterService;
	@Autowired
	Count count;
	
	

	
	 Logger log = Logger.getLogger(HomeController.class);
	 
	
	@RequestMapping(value = "/incrementcounter", method = RequestMethod.GET)
	public synchronized String incrementcounter() {
		log.info("inside incrementcounter controller "  );
		int currentCount=counterService.getCounter();
		int updatedCount= counterService.addCounter(currentCount+1);
		log.info("controller: newNum is "   + "\n" + updatedCount );
		
		 return "success for number " +updatedCount ;
	}
	
	}


