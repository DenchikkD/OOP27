package sql;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.sql.*;

/**
 * Created by Denni on 06.07.2016.
 */
public class TestJDBC {
    public static void main(String[] args) {
        try {
            System.out.println(new PrintStream("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Denis Kondratiuk");
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
//            Driver driver =
//            Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3306/new_schema";
            con = DriverManager.getConnection(url,"root","root");
            stmt = con.createStatement();
            rs=stmt.executeQuery("SELECT * FROM students");
            while (rs.next()){
                String str = rs.getString(1)+":"+rs.getString(2);
                printString(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                if(rs!=null){
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if(con!=null){
                    con.close();
                }
            }catch (SQLException ex){
                ex.printStackTrace();
                System.err.println("Error: "+ex.getMessage());
            }

        }

    }
    public static void printString (Object s){
        try {
            System.out.println(new String (s.toString().getBytes("windows-1251"),"windows-1252"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
