/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Playlist;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author t00178760
 */
public class PlaylistDAO {
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public PlaylistDAO(){
        
    }
    
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
    
    public Playlist find(String id) {
        Playlist playlist = null;

        openConnection();
        String sql="SELECT * FROM PLAYLIST WHERE ID_PLAYLIST = '" + id +"'";
         System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                playlist = new Playlist(
                        id,
                        this.resultSet.getInt("id_library"),
                        this.resultSet.getString("name"),
                        this.resultSet.getDate("date_creation"),
                        this.resultSet.getBoolean("hidden")
                );
                System.out.println(sql);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();

        return playlist;
    }
    
    public Playlist create(Playlist newPlaylist) {
        Playlist playlist = newPlaylist;
        String hidden="";
        if(newPlaylist.isHidden()){
            hidden="y";
        }else{
            hidden="n";
        }
        
        String sql="";
        if(newPlaylist.getCreationDate()!=null){
        sql = " INSERT INTO PLAYLIST"
                + " VALUES('" + newPlaylist.getIDPlaylist() +"'," 
                + newPlaylist.getIDLibrary() +",'"+newPlaylist.getName()+"','"
                + newPlaylist.getCreationDate() +"','"+hidden+"')";
        }else{
            sql = " INSERT INTO PLAYLIST"
                + " VALUES('" + newPlaylist.getIDPlaylist() +"'," 
                + newPlaylist.getIDLibrary() +",'"+newPlaylist.getName()+"',"
                + newPlaylist.getCreationDate() +",'"+hidden+"')";
        }
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        closeConnection();

        return playlist;
    }
    
    public Playlist update(Playlist upPlaylist) {
        String sql = "UPDATE PLAYLIST "
                +"SET ID_PLAYLIST='"+upPlaylist.getIDPlaylist()+"',"
                +"SET ID_LIBRARY='"+upPlaylist.getIDLibrary()+"',"
                +"SET NAME='"+upPlaylist.getName()+"',"
                +"SET CREATION_DATE='"+upPlaylist.getCreationDate()+"',"
                +"SET HIDDEN='"+upPlaylist.isHidden()+"',;";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        closeConnection();

        return upPlaylist;
    }
    
    public Playlist delete(Playlist playlist) {
        String sql = "DELETE FROM PLAYLIST WHERE ID_PLAYLIST = '"+playlist.getIDPlaylist()+"';";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        }catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        return playlist;
    }
    
    public List<Playlist> findAll() {
        List<Playlist> playlists = new ArrayList();
        Playlist playlist = null;
        String sql = "SELECT * FROM PLAYLIST";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                playlist = new Playlist(
                        this.resultSet.getString("id_playlist"),
                        this.resultSet.getInt("id_library"),
                        this.resultSet.getString("name"),
                        this.resultSet.getDate("creation_date"),
                        this.resultSet.getBoolean("hidden")
                        );
                playlists.add(playlist);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return playlists;
    }
}
