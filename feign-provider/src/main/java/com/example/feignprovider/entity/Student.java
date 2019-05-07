package com.example.feignprovider.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private char sex;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Student(String name, char sex, int age, String phone) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
    }

    public Student() {
    }

    @Override
    public String toString() {

        return "name:" + name + ",sex:" + sex + ",age:" + age + ",phone:" + phone;
    }


}
