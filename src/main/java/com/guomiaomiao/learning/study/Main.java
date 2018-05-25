package com.guomiaomiao.learning.study;

import com.guomiaomiao.learning.study.pojo.Person;
import com.guomiaomiao.learning.study.service.IWorkService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 15295 on 2018/5/21.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextAop.xml");
        Person guomiaomiao = (Person) ac.getBean("guomiaomiao");
        Person xiongzehua = (Person) ac.getBean("xiongzehua");
        IWorkService iWorkService = (IWorkService) ac.getBean(IWorkService.class);
        String string = iWorkService.working(guomiaomiao, xiongzehua);
        System.out.println(string);
    }
}
