package com.guomiaomiao.learning.guomiaomiao;

import com.guomiaomiao.learning.study.pojo.Car;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 15295 on 2018/5/12.
 */
public class Person {
    private String name;
    private List<Role> list;
    private Map<Address, Car> map;
    private Set<Role> set;

    public void setName(String name) {
        this.name = name;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    public void setMap(Map<Address, Car> map) {
        this.map = map;
    }

    public void setSet(Set<Role> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                '}';
    }
}
