/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Music;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author t00178760
 */
public class MusicDAO {

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
    
    public Music find(String id) {
        Music music = null;

        openConnection();
        try {
            this.resultSet = statement.executeQuery("SELECT * FROM MUSIC WHERE ID_TRACK = '" + id +"';");
            if (this.resultSet.first()) {
                music = new Music(
                        id,
                        this.resultSet.getString("id_playlist"),
                        this.resultSet.getString("title"),
                        this.resultSet.getInt("track_number"),
                        this.resultSet.getString("artist"),
                        this.resultSet.getString("album_title"),
                        this.resultSet.getString("type_music"),
                        this.resultSet.getDate("release_year")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return music;
    }

    public Music create(Music music) {
        return null;
    }

    public Music update(Music music) {
        return null;
    }

    public void delete(Music music) {
    }

    public List<Music> findAll() {
        return null;
    }

    public List<Music> findById() {
        return null;
    }
}
