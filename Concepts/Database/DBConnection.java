package Concepts.Database;

import java.lang.Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    String url = "jdbc:mysql://localhost:8889/students";
    Connection conn = null;

    public DBConnection(){
        int rollno = 6;
        String name = "Arvey";
        int age = 25;

        String sql = "insert into students(roll_no, name, age) values(" + rollno + ", '"+ name + "', "+ age+ ")";

        try{
            conn = DriverManager.getConnection(url, "root", "root");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);

            if(m == 1){
                System.out.println("insert success "+ sql);
            }else{
                System.out.println("insert failure");
            }
            conn.close();

        }
        catch(SQLException e){
            // 
            System.err.println("SQL Exception");
            System.err.println(e);
        }
    }
}