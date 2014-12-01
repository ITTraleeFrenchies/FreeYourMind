/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.Like_Playlist;
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

public class Like_PlaylistDAO {

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

    public Like_Playlist find(long id) {
        Like_Playlist like_playlist = null;
        String sql = "SELECT * FROM LIKE_PLAYLIST WHERE ID_LIKELIST = '" + id + "'";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                like_playlist = new Like_Playlist(
                        this.resultSet.getInt("id_likelist"),
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("id_playlist"),
                        this.resultSet.getDate("date_creation"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method find");
        }
        closeConnection();

        return like_playlist;
    }

    public Like_Playlist create(Like_Playlist likePlaylistToCreate) {
         Like_Playlist like_playlist = likePlaylistToCreate;
        String sql = "INSERT INTO LIKE_PLAYLIST VALUES(" 
                + like_playlist.getId_playlist() + ",'"
                + like_playlist.getTNumber()+ "','"
                + like_playlist.getId_playlist() + "',"
                + like_playlist.getDate_creation()+ ")";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
          
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method create");
        }
        closeConnection();

        return like_playlist;
    }

    public Like_Playlist update(Like_Playlist likePlaylist) {
        return null;
    }

    public Like_Playlist delete(Like_Playlist likePlaylist) {
        return null;
    }

    public List<Like_Playlist> findAll() {
        return null;
    }

    public List<Like_Playlist> findById() {
        return null;
    }
}
