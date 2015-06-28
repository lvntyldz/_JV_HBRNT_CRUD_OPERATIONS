package com.company.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by root on 6/28/15.
 */

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY  = new Configuration().configure().buildSessionFactory();


    public static SessionFactory getSession(){
        return SESSION_FACTORY;
    }


    public static void closeSession(){
        getSession().close();
    }


}
