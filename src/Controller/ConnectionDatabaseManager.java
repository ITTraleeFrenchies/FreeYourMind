package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    /**
     * Obtain a connection to the Oracle database.
     *
     * @throws java.sql.SQLException
     */
    public void connectionDatabase() throws SQLException {
        connection = DriverManager.getConnection(nameDriver, username, password);
        statement = connection.createStatement();
    }

    public String getMEMBERContent() throws SQLException {
        resultSet = statement.executeQuery("SELECT * FROM MEMBER");
        String content = "";
        String newLine = System.getProperty("line.separator");
        while (resultSet.next()) {
            String tnumber = resultSet.getString("TNUMBER");
            String nickname = resultSet.getString("NICKNAME");
            String password = resultSet.getString("PASSWORD");
            String firstname = resultSet.getString("FIRSTNAME");
            String surname = resultSet.getString("SURNAME");
            String date_birth = resultSet.getString("DATE_BIRTH");
            String email_addr = resultSet.getString("EMAIL_ADDR");
            String street = resultSet.getString("STREET");
            String city = resultSet.getString("CITY");
            String country = resultSet.getString("COUNTY");
            String subscription_date = resultSet.getString("SUBSCRIPTION_DATE");
            //  String profile_pic = resultSet.getString("PROFILE_PIC");
            //  System.out.println(tnumber + "   " + nickname);
            content += tnumber + "," + nickname +newLine;
        }
        return content;
    }

    public void closeConnection() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(" Error with the close connection. ");
        }
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

}
