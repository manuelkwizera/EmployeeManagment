package com.employee.employeemanagment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "spouce")
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String mobileNo;
    private int age;

    @OneToOne(mappedBy = "spouce")
    private Employee employee;

    public Spouse(int id, String name, String mobileNo, int age) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
