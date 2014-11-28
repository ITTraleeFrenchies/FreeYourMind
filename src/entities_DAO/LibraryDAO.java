/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
/**
 *
 * @author t00178764
 */



public class LibraryDAO {
    
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
      public void openConnection() {
        try {
            this.connection = DriverManager.getConnection(nameDriver, username, password);
            this.statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the openning of  connection. ");
        }
    }

    public void closeConnection() {
        try {
            if (this.connection != null && this.statement != null && this.resultSet != null) {
                this.connection.close();
                this.statement.close();
                this.resultSet.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the closing of connection. ");
        }

    }

    public LibraryDAO() {
    }
    
    
    public Library findById(int id) {
        Library library = null;
        String sql = "SELECT * FROM LIBRARY WHERE ID_LIBRARY = '" + id + "'";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                library = new Library(
                        this.resultSet.getInt("id_library"),
                        this.resultSet.getString("name"),
                        this.resultSet.getString("member"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return library;
    }

    public Library create(Library library) {
        return null;
    }

    public Library update(Library library) {
        return null;
    }

    public void delete(Library library) {
    }

    public List<Library> findAll() {
        return null;
    }

    
}