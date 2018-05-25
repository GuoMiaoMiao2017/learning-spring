package com.guomiaomiao.learning.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 15295 on 2018/5/19.
 */
@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(public int com.guomiaomiao.learning.aop.Calculator.*(int, int))")
    public void point(){}

    @Before("point()")
    public void before(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        List<java.lang.Object> args = Arrays.asList(joinPoint.getArgs());
        System.out.println("The methods " + methodName + " begins with..." + args);
    }
    @After("point()")
    public void after(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The methods " + methodName + " end...");
    }
    @AfterReturning(value = "point()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The methods " + methodName + " end with..." + result);
    }
    @AfterThrowing(value = "point()", throwing = "ex")
    public void AfterThrowing(JoinPoint joinPoint, Exception ex) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("The methods " + methodName + "occurs exception" + ex);
    }
}
