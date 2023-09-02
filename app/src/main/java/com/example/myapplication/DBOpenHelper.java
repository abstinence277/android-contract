package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import com.mysql.jdbc.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

/**
 * 数据库工具类：连接数据库用、获取数据库数据用
 * 相关操作数据库的方法均可写在该类
 */
public class DBOpenHelper {
    private static String driver = "com.mysql.jdbc.Driver";// MySql驱动
    private static String user = "root";// 用户名
    private static String password = "baekhyun277666.";// 密码
    //连接数据库
    static Connection getConn(){
        Connection connection = null;
        try{
            Class.forName(driver);
            String ip = "114.251.216.152";
            connection = DriverManager.getConnection("jdbc:mysql://" + ip + ":3307/oneeight", user, password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    //关闭数据库
    public static void closeAll(Connection conn, PreparedStatement ps, ResultSet rs) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
