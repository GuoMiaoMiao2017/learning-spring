package com.guomiaomiao.learning.guomiaomiao;

/**
 * Created by 15295 on 2018/5/14.
 */
public class Address {
    private String city;
    private String jiedao;

    public void setCity(String city) {
        this.city = city;
    }

    public void setJiedao(String jiedao) {
        this.jiedao = jiedao;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", jiedao='" + jiedao + '\'' +
                '}';
    }
}
