package com.guomiaomiao.learning.study.pojo;


import java.util.List;

/**
 * Created by 15295 on 2018/5/18.
 */
public class Person {
    private String name;
    private int age;
    private List<Car> carList;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
