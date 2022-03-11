package com.example.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {
    PreparedStatement preparedStatement=null;
    Connection connection=null;
    //操作数据库方法
    public void operatingDatabase(User user)  {
        try{
            connection = DBUtil.getConnection();
            //第3步：创建运行SQL的语句对象(Statement)
            String sql="insert into t_user (user_name,password,nick_name)values (?,?,?) ";
            preparedStatement = connection.prepareStatement(sql);
            //添加参数
            preparedStatement.setString(1,user.getUserName());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setString(3,user.getNickName());
            //运行，得到结果集
            int i = preparedStatement.executeUpdate();
            System.out.println("影响了"+i+"条");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭结果集
            try {
                //第6步：释放资源
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }



    }
}
