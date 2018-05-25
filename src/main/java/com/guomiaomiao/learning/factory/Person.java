package com.guomiaomiao.learning.factory;

/**
 * Created by 15295 on 2018/5/17.
 */
public class Person {
    private String name;
    private String sex;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void init1() {
        System.out.println("这是一个init方法");
    }

    public void destroy() {
        System.out.println("这是一个destroy方法");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
