package com.company.controller;

import com.company.entities.Person;
import com.company.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by root on 6/28/15.
 */
public class Run {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSession().openSession();

//        CREATE
        session.beginTransaction();
        Person person = new Person();

        person.setCreatedate(new Date());
        person.setAge(33);
        person.setName("ali");
        person.setLastname("veli");

        session.save(person);
        session.getTransaction().commit();


    }

}
