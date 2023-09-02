package com.example.myapplication;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBServer {

    private Connection conn = null; //打开数据库对象
    private PreparedStatement ps = null;//操作整合sql语句的对象
    private ResultSet rs = null;//查询结果的集合

    //DBService 对象
    public static DBServer dbService = null;

    private DBServer() {

    }


    public static DBServer getDbService() {
        if (dbService == null) {
            dbService = new DBServer();
        }
        return dbService;
    }

    //查询数据库
    public static String query() {
        // 查询的 sql 语句,需要甲乙方都不为NULL
        String sql = "select xm_oc_contractcode,xm_oc_signtime,xm_oc_signlocation from xm_operationcontract" +
                "where xm_oc_purchaseunit is not null and xm_oc_operationinit is not null";
        Connection connection = (Connection) DBOpenHelper.getConn();
        PreparedStatement ps = null;
        ResultSet rs = null;
        StringBuilder builder = new StringBuilder();
        try {
            ps = (PreparedStatement) connection.prepareStatement(sql);
            // 执行语句（执行查询语句用的是 executeQuery 方法）
            rs = (ResultSet) ps.executeQuery();
            // 得到查询结果
            if (rs != null) {
                while (rs.next()) {
                    builder.append("[合同编号：");
                    builder.append(rs.getString("xm_oc_contractcode"));
                    builder.append("防治时间：");
                    builder.append(rs.getInt("xm_oc_signtime"));
                    builder.append("签订地点");
                    builder.append(rs.getInt("xm_oc_signlocation"));
                    builder.append("] ");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return builder.toString();
    }

    //插入数据，甲方签订，只插入甲方的数据
    public static void insert(String jia) {
        // 插入数据的 sql 语句
        String sql = "insert into xm_operationcontract(xm_oc_purchaseunit) values {?}";
        Connection connection = (Connection) DBOpenHelper.getConn();
        PreparedStatement ps = null;
        if (connection == null) {
            return;
        }
        try {
            ps = (PreparedStatement) connection.prepareStatement(sql);
            // 为两个 ? 设置具体的值
            ps.setString(1, jia);
            // 执行语句
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //修改数据,以修改飞机名称为例
    public static void update(String news, String code) {
        // 更新数据的 sql 语句
        String sql = "update xm_operationcontract set xm_oc_taskplanename = ? where xm_oc_contractcode = ?";
        Connection connection = (Connection) DBOpenHelper.getConn();
        PreparedStatement ps = null;
        try {
            ps = (PreparedStatement) connection.prepareStatement(sql);
            // 为两个 ? 设置具体的值
            ps.setString(1, news);
            ps.setString(2, code);
            // 执行语句
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}