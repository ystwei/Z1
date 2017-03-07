package com.weikun.N;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/3/7.
 */
public class B {
    @Test
    public void delete(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");

            String sql="delete from a where id=?";

            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,11);

            System.out.println(pstmt.executeUpdate()>0?"成功":"失败");

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }











    @Test
    public void add(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        //1加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql="insert into a (v_name,v_sex,v_salary) values(?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"哈尔滨");
            pstmt.setString(2,"M");
            pstmt.setFloat(3,9.02f);
            System.out.println(pstmt.executeUpdate()>0?"成功":"失败");

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(pstmt!=null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    @Test//带条件的查询
    public void queryByCondition(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;//结果集
        //1加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2做连接
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            //3.执行sql
            String sql="select * from orderitems where item_price>? ";//SQL注入攻击
            pstmt=conn.prepareStatement(sql);
            pstmt.setFloat(1,10f);
            rs=pstmt.executeQuery();
            //4遍历结果集
            while(rs.next()){//是否有结果数据，如果有为true，否则为flase
                System.out.printf("%s---%.2f\n",
                        rs.getString("prod_id"),
                        rs.getFloat("item_price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {//关闭
                if(rs!=null){//防止出现空指针错误
                    rs.close();
                }
                if(pstmt!=null){//防止出现空指针错误
                    pstmt.close();
                }
                if(conn!=null){//防止出现空指针错误
                    conn.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }


    @Test
    public void queryAll(){
        Connection conn=null;//连接对象
        PreparedStatement pstmt=null;//处理sql的对象
        ResultSet rs=null;//结果集
        try {  //1.加载驱动到内存
            Class.forName("com.mysql.jdbc.Driver");
            //2做连接,保证你进数据不能出现乱码
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8",
                    "root",
                    "root");
            String sql="select * from orderitems";
            //3.执行sql语句
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();            //4遍历结果集
            while(rs.next()){//是否有结果数据，如果有为true，否则为flase
                System.out.printf("%s---%.2f\n",
                        rs.getString("prod_id"),
                        rs.getFloat("item_price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                rs.close();
                pstmt.close();
                conn.close();//5关闭连接
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
