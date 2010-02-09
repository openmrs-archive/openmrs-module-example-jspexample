package org.openmrs.module.jspexample.db.hibernate;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.openmrs.module.jspexample.RoomTemperature;
import org.openmrs.module.jspexample.db.JspExampleDAO;


public class HibernateJspExampleDAO implements JspExampleDAO {

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public RoomTemperature getLatestRoomTemperature() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(RoomTemperature.class);
		
		//criteria.setProjection(Projections.max("time"));
		
		//criteria.add(Expression.gt("temp", 100));
		
		//"select * from room_temperature group by time having max(time)";
		
		criteria.addOrder(Order.desc("time"));
		
		return (RoomTemperature)criteria.uniqueResult();
		
	}
	
}
