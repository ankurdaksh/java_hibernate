package org.example;

import models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.gfg.Configuration;

public class App 
{
    public static void main( String[] args ) {

        Configuration configuration  = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();


        session.beginTransaction();
        Employee employee = new Employee(4,"mkkkk","mkkkk@gmail.com");


        session.save(employee);
//        int c =10/0;
//
//        session.save(new Employee(4,"kal","kal@gmail.com"));
        session.getTransaction().commit();

    }
}
