package com.guomiaomiao.learning.study.loggingAspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


/**
 * Created by 15295 on 2018/5/21.
 */
@Aspect
@Component
public class Logging {
    @Before("execution(* com.guomiaomiao.learning.study.service.impl.WorkServiceImpl.*(com.guomiaomiao.learning.study.pojo.Person,com.guomiaomiao.learning.study.pojo.Person))")
    public void before() {
        System.out.println("努力学习");
    }
    @After("execution(* com.guomiaomiao.learning.study.service.impl.WorkServiceImpl.*(com.guomiaomiao.learning.study.pojo.Person,com.guomiaomiao.learning.study.pojo.Person))")
    public void after() {
        System.out.println("找到工作");
    }
}
