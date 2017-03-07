package com.weikun.N;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/3/7.
 */
public class A {
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

            System.out.println(pstmt.executeUpdate()>0?"�ɹ�":"ʧ��");

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
        //1��������
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            String sql="insert into a (v_name,v_sex,v_salary) values(?,?,?)";
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,"������");
            pstmt.setString(2,"M");
            pstmt.setFloat(3,9.02f);
            System.out.println(pstmt.executeUpdate()>0?"�ɹ�":"ʧ��");

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

    @Test//�������Ĳ�ѯ
    public void queryByCondition(){
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;//�����
        //1��������
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2������
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");
            //3.ִ��sql
            String sql="select * from orderitems where item_price>? ";//SQLע�빥��
            pstmt=conn.prepareStatement(sql);
            pstmt.setFloat(1,10f);
            rs=pstmt.executeQuery();
            //4���������
            while(rs.next()){//�Ƿ��н�����ݣ������Ϊtrue������Ϊflase
                System.out.printf("%s---%.2f\n",
                        rs.getString("prod_id"),
                        rs.getFloat("item_price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {//�ر�
                if(rs!=null){//��ֹ���ֿ�ָ�����
                    rs.close();
                }
                if(pstmt!=null){//��ֹ���ֿ�ָ�����
                    pstmt.close();
                }
                if(conn!=null){//��ֹ���ֿ�ָ�����
                    conn.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }


    @Test
    public void queryAll(){
        Connection conn=null;//���Ӷ���
        PreparedStatement pstmt=null;//����sql�Ķ���
        ResultSet rs=null;//�����
        try {  //1.�����������ڴ�
            Class.forName("com.mysql.jdbc.Driver");
            //2������,��֤������ݲ��ܳ�������
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8",
                    "root",
                    "root");
            String sql="select * from orderitems";
            //3.ִ��sql���
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();            //4���������
            while(rs.next()){//�Ƿ��н�����ݣ������Ϊtrue������Ϊflase
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
                conn.close();//5�ر�����
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
