package com.guomiaomiao.learning.aop;

import org.springframework.stereotype.Service;

/**
 * Created by 15295 on 2018/5/19.
 */
//@Component
    @Service
public class CalculatorImpl implements Calculator {
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
