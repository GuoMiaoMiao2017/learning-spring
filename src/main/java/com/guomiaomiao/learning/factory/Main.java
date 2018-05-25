package com.guomiaomiao.learning.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by 15295 on 2018/5/15.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        beansCycleDemo();
    }

    public static void beansCycleDemo() {
        ClassPathXmlApplicationContext alc = new ClassPathXmlApplicationContext("beans-cycle.xml");
        Person person = (Person) alc.getBean("person");
        System.out. println(person);
    }

    public static void jdbc() throws Exception {
        final String URL="jdbc:mysql://192.168.1.103:3306/student_information";
        final String USER="mmall";
        final String PASSWORD="mmall";

        /**
         * registerDriver(new Driver() 向 DriverManager 注册给定驱动程序
         最开始使用的时候，不明白为什么首先要加载一个驱动类，之后就可以取得了Connection了，很好奇DriverManager是怎么获得那个驱动类的信息，后来看了下com.mysql.jdbc.Driver这个类的源代码，豁然开朗了。原来在com.mysql.jdbc.Driver类中有这么一段静态初始化代码：
         static {
         try {
         java.sql.DriverManager.registerDriver(new Driver());
         } catch (SQLException E) {
         throw new RuntimeException(“Can’t register driver!”);
         }
         }
         也就是，在Class.forName加载完驱动类，开始执行静态初始化代码时，会自动新建一个Driver的对象，并调用DriverManager.registerDriver把自己注册到DriverManager中去
         */
        //加载驱动程序
        //forName()返回与带有给定字符串名的类或接口相关联的 Class 对象
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库的连接：
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

        //创建一个 Statement 对象来将 SQL 语句发送到数据库。
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select username,email from stumanage_user");

        while (rs.next()) {
            System.out.println(rs.getString("username") + "," + rs.getString("email"));
        }
    }

    /**
    基本方法：
    java.sql.Connection getConnection();

    实现1：
    SimpleDriverDataSource。
    spring自带，但不属于核心框架，需要<artifactId>spring-jdbc</artifactId>
    org.springframework.jdbc.datasource.SimpleDriverDataSource implements javax.sql.DataSource
     实现2:
    DBCP连接池。
    需要<artifactId>commons-dbcp</artifactId>
    org.apache.commons.dbcp.BasicDataSource implements javax.sql.DataSource
    */

    //下面以1. 基本实现的方法实现dateSource

    public void basicDataSource() throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) ac.getBean("dataSource");

        Connection conn = dataSource.getConnection();
        //创建一个 Statement 对象来将 SQL 语句发送到数据库。
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select username,email from stumanage_user");

        while (rs.next()) {
            System.out.println(rs.getString("username") + "," + rs.getString("email"));
        }
    }
}
