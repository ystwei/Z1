package com.weikun.N;

import org.junit.Test;

import java.sql.*;

/**
 * Created by Administrator on 2017/3/7.
 */
public class C{

    @Test
    public void testFun() {
        Connection  conn=null;
        CallableStatement cs=null;
        try {

            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8","root","root");

            String sql="{?=call f_4(?)}";

            cs=conn.prepareCall(sql);
            cs.registerOutParameter(1,Types.INTEGER);//���õ�һ������Ϊ�������
            cs.setFloat(2,50);//���õڶ����������

            cs.execute();//ִ��
            System.out.println(cs.getObject(1));//ȡ���������




        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(cs!=null){
                try {
                    cs.close();
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











    @Test
    public void testPro() {

        Connection conn = null;

        CallableStatement cs=null;//����洢���̺ͺ�����
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");

            String sql = "call p_12(?,?)";
            cs=conn.prepareCall(sql);//����sql����
            cs.setFloat(1,20);//���õ�һ���������������
            cs.registerOutParameter(2, Types.FLOAT);//�����������
            boolean flag=cs.execute();//ִ�У��Ƿ���ȷ
            while(flag){
                System.out.println(cs.getObject(2));//�õ��������
                //�õ������
                rs=cs.getResultSet();
                while(rs.next()){
                    System.out.println(rs.getFloat("item_price"));
                }
                flag=cs.getMoreResults();//�Ƿ��и���Ľ������û�о��Ǽ٣��˳�ѭ��
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cs != null) {
                try {
                    cs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void update() {
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bz?useUnicode=true&characterEncoding=utf-8", "root", "root");

            String sql = "update a set v_name = ? where id = ?";

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, "�Ϻ�");
            pstm.setInt(2, 12);
            pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
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

