package com.example.demo.entity;

import com.example.demo.until.Page;

public class Student extends Page {
    private int sid;
    private String sname;
    private int sex;
    private int age;
    private String address;
    private int cid;
    private Clazz Clazz;

    public Student() {
    }

    public Student(int sid, String sname, int sex, int age, String address, int cid, com.example.demo.entity.Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.cid = cid;
        Clazz = clazz;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getCid() {
        return cid;
    }

    @Override
    public void setCid(int cid) {
        this.cid = cid;
    }

    public com.example.demo.entity.Clazz getClazz() {
        return Clazz;
    }

    public void setClazz(com.example.demo.entity.Clazz clazz) {
        Clazz = clazz;
    }
}
