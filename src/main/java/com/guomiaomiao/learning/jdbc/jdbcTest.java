package com.guomiaomiao.learning.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;


/**
 * Created by 15295 on 2018/5/20.
 */
public class jdbcTest {

    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContextFile.xml");
        DataSource dataSource = (DataSource) ac.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }

}
