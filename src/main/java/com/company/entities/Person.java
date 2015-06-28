package com.company.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by root on 6/28/15.
 */

@Entity
@Table(name = "persons")
public class Person implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  int id;

    @Column(name = "name" , nullable = false ,length = 20)
    private String name;

    @Column(name = "lastname" , nullable = false ,length = 20)
    private String lastname;

    @Column(name = "age" , nullable = false ,length = 3)
    private int age;

    @Temporal(TemporalType.DATE)
    @Column(name = "createdate" , nullable = false ,length = 7)
    private Date createdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
