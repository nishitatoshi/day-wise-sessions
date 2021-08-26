package com.techment.services;

import java.sql.*;  

public class LoginDao {  
public static boolean validate(String name,String pass){  
boolean status=false;  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userreg?autoReconnect=true&useSSL=false", "root", "123456");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from userreg where name=? and pass=?");  
ps.setString(1,name);  
ps.setString(2,pass);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
System.out.println("You are successfully logged in...");  

          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  
