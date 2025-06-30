/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BloodBank;

import java.sql.*;

/**
 *
 * @author dhivy
 */
public class DbConnection {
    private static final String url="jdbc:mysql://localhost:3306/login";
    private static final String username="root";
    private static final String password="dhivya@28";
    public static Connection connect() throws SQLException {
        // TODO code application logic here
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                return DriverManager.getConnection(url,username,password);
            } catch (ClassNotFoundException e) {
                throw new SQLException("Error while connecting database",e);
            }
    }
}
