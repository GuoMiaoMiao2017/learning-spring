package com.guomiaomiao.learning.study.service.impl;

import com.guomiaomiao.learning.study.pojo.Person;
import com.guomiaomiao.learning.study.service.IWorkService;
import org.springframework.stereotype.Component;

/**
 * Created by 15295 on 2018/5/21.
 */
@Component
public class WorkServiceImpl implements IWorkService {
    @Override
    public String working(Person person1, Person person2) {
        return person1 + "跟" + person2 + "合作";
    }
}
