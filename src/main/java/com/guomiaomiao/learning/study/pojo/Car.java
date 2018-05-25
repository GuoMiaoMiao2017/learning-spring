package com.guomiaomiao.learning.study.pojo;

/**
 * Created by 15295 on 2018/5/21.
 */
public class Car {
    private String pinpai;
    private int price;
    private int sudu;



    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }



    public void setPrice(int price) {
        this.price = price;
    }



    public void setSudu(int sudu) {
        this.sudu = sudu;
    }

    @Override
    public String toString() {
        return "Car{" +
                "pinpai='" + pinpai + '\'' +
                ", price=" + price +
                ", sudu=" + sudu +
                '}';
    }
}
