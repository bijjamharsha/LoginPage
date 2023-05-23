package org.ass.guvi.repository;

import org.ass.guvi.dto.LoginDto;
import org.ass.guvi.entity.ProfileEntity;
import org.ass.guvi.entity.SignupEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 

@Repository
public class RigisterRepository {
	@Autowired
	private SessionFactory sessionfactory;
	public void save(SignupEntity signupEntity) {
		try {
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(signupEntity);
			transaction.commit();
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	public void update(ProfileEntity profileEntity) {
		try {
			Session session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(profileEntity);
			transaction.commit();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	
	}
	public void login(String email ,String password) {
		StringBuilder builder = new StringBuilder();
		builder.append(" select * from sigin_up_info whare  email=:e and password=:p");
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery(builder.toString());
		query.setParameter("e", email);
		query.setParameter("p",password);
		
		query.executeUpdate();
		transaction.commit();
	}
	
}
