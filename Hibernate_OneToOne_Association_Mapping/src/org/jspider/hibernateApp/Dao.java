package org.jspider.hibernateApp;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Dao  // DAO CLASS
{
	public static void main(String[] args) 
	{
     Passport passport = new Passport();
     passport.setPassport_name("Deepak-Tiwari");
     Person person = new Person();
     person.setPerson_name("Deepak");
     person.setPassport(passport);
     Configuration conf = new Configuration();
     conf.configure();
     SessionFactory sef = conf.buildSessionFactory();
     Session ses = sef.openSession();
     Transaction tran = ses.beginTransaction();
     ses.save(person);
     tran.commit();
     ses.close();
	}
}
