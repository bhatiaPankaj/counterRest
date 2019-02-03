package com.project.counter.daoImpl;

import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.counter.dao.CounterDao;
import com.project.counter.model.Count;

@Component
@Repository
public class CounterDaoImpl implements CounterDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private Count count;
	int n = 1;
	Logger logger = Logger.getLogger(CounterDaoImpl.class);

	
	public int getCounter() {
		logger.info("inside getCounter dao ");
		Session session = this.sessionFactory.getCurrentSession();
		count = (Count) session.get(Count.class, n, LockMode.PESSIMISTIC_WRITE);
		logger.info("exiting getCounter dao ");
		return count.getNum();
	}

	// can we make just a single instance to getCounter() and then use the cache?

	
	public int incrementCounter(int newCounter) {
		logger.info("inside increementCounter dao ");
		Session session = this.sessionFactory.getCurrentSession();
		count = (Count) session.get(Count.class, n, LockMode.PESSIMISTIC_WRITE);
		count.setNum(newCounter);
		session.update(count);
		logger.info("exiting increementCounter dao ");
		return count.getNum();
	}

}
