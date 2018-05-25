package com.guomiaomiao.learning.guomiaomiao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15295 on 2018/5/12.
 */
public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("小美");
//        person.hello();
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");


        Person person = (Person)ac.getBean("person");
//        Person person2 = (Person)ac.getBean("person2");
        System.out.println(person);
    }
}
