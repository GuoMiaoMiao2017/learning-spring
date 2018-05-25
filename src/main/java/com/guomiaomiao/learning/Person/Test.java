package com.guomiaomiao.learning.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by 15295 on 2018/5/18.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        person.setName("guomiaomiao");
        person.setAge(18);
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:/gmm/person.txt"));
        os.writeObject(person);
        os.flush();
        os.close();

        ObjectInputStream is = new ObjectInputStream(new FileInputStream("C:/gmm/person.txt"));
        person = (Person) is.readObject();
        is.close();
        System.out.println("name = " + person.getName());
        System.out.println("age = " + person.getAge());
    }
}
