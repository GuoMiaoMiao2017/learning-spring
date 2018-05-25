package com.guomiaomiao.learning.Person;
import java.io.Serializable;
/**
 * Created by 15295 on 2018/5/18.
 */
public class Person implements Serializable {
        private String name;
        private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
