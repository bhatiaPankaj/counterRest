
package com.project.counter.daoImpl;

import org.apache.log4j.Logger;
import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.counter.dao.CounterDao;
import com.project.counter.exceptionHandler.CounterDaoException;
import com.project.counter.model.Count;

/**
 * This class implements the interface CounterDao to interact with the database
 * and increase the counter persisting there
 * 
 * @author Pankaj
 *
 */
@Component
@Repository
public class CounterDaoImpl implements CounterDao {

	/**
	 * This parameter binds the session factory property of hibernate framework and
	 * passes it to the session object for database transactiions
	 */
	@Autowired
	private SessionFactory sessionFactory;
	/**
	 * This property binds the Model count with the database number to increment the
	 * counter in it
	 */
	@Autowired
	private Count count;
	/**
	 * this is used to fetch the count from the table against id being 1
	 */
	int n = 1;
	Logger logger = Logger.getLogger(CounterDaoImpl.class);

	/**
	 * this method interacts with the database to fetch the existing counter and
	 * throws CounterDaoException if some error comes up
	 */
	public void incrementCounter() throws CounterDaoException {
		logger.info("inside getCounter dao ");
		Session session = this.sessionFactory.getCurrentSession();
		SQLQuery query = session.createSQLQuery("update test.number set num=num+1 where id=1");
		query.executeUpdate();
		logger.info("exiting getCounter dao ");
	}

	
}
