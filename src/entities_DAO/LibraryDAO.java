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
import java.util.ArrayList;
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
            System.out.println(ex.getErrorCode() + " error with the method findById");
        }
        closeConnection();

        return library;
    }

    /*
    =========== We're not supposed to have this method because there is a trigger for that. =============
    public Library create(Library libraryToCreate) {
        Library library = libraryToCreate;
        String sql = " INSERT INTO LIBRARY(ID_LIBRARY,NAME,MEMBER) VALUES('"
                + library.get_id_library() + "','"
                + library.get_name() + "','"
                + library.get_member() + ")";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
               System.out.println(ex.getErrorCode() + " error with the method create");
        }
        closeConnection();

        return library;
    }
    */

    public Library update(Library libraryToUpdate) {
        Library library = libraryToUpdate;
        String sql = " UPDATE LIBRARY SET NAME = '" +  library.getName()+ "' "+ 
                "WHERE ID_LIBRARY = "+ library.getId_library();

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
              ex.printStackTrace();
        }
        closeConnection();

        return library;
    }

    public Library delete(Library libraryToDelete) {
         Library library = libraryToDelete;
        String sql = " DELETE FROM LIBRARY WHERE ID_LIBRARY = "+ libraryToDelete.getId_library();

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
             System.out.println(ex.getErrorCode() + " error with the method delete");
        }
        closeConnection();

        return library;
    }

    public List<Library> findAll() {
        List<Library> libraries = new ArrayList();
        Library library = null;
        String sql = "SELECT * FROM LIBRARY";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                library = new Library(
                        this.resultSet.getInt("id_library"),
                        this.resultSet.getString("name"),
                        this.resultSet.getString("member"));
                libraries.add(library);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method findAll");
        }
        closeConnection();

        return libraries;
    }

}
