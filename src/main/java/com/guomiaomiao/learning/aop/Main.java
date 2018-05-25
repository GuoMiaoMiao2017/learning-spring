package com.guomiaomiao.learning.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15295 on 2018/5/19.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextAop.xml");
        Calculator calculator = ac.getBean(Calculator.class);
        int result = calculator.div(12,6);
        System.out.println("result = " + result);
    }
}
