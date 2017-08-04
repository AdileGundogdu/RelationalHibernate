package com.adile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();




        session.getTransaction().commit();
        session.close();
        System.out.println("Finish!");
    }
}
