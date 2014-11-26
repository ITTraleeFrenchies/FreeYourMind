package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author t00178747
 */
public class ConnectionDatabaseManager {

    private static String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private static String username = "mm3";
    private static String password = "mm3";
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    /**
     * Obtain a connection to the Oracle database.
     *
     * @throws java.sql.SQLException
     */
    public static void connectionDatabase() throws SQLException {
         connection = DriverManager.getConnection(nameDriver, username, password);
         statement = connection.createStatement();
    }

    public static void getMEMBERContent() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM MEMBER");

        while (resultSet.next()) {
            String tnumber = resultSet.getString("TNUMBER");
            String nickname = resultSet.getString("NICKNAME");
            System.out.println(tnumber + "   " + nickname);
        }

       
    }
    
    public static void closeConnection(){
         try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(" Error : " + e.getMessage());
        }
    }

    public static void main(String[] args) throws SQLException {
        connectionDatabase();
    }

}
