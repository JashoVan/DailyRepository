package org.example.SQLDraft;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Program: javaweb
 * @ClassName HelloConnection1
 * @Description:
 * @Author: JashoVan
 * @Create: 2023-12-22 16:02
 * @Version 1.0
 */
public class HelloConnection1 {
    public static void main(String[] args) {

        try {
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
//            jdbc:mysql://localhost:3306/test
            // 技术名字  ：连接的数据库：//ip：端口/数据库名
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "abc123");
            System.out.println(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}