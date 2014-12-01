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
import java.util.ArrayList;
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
            System.out.println(e.getErrorCode() + " error with the method find");
        }
        closeConnection();

        return music;
    }

    public Music create(Music newMusic) {
        Music music = newMusic;
        String sql = " INSERT INTO MUSIC(ID_TRACK,ID_PLAYLIST,TITLE,TRACK_NUMBER,"
                + "ARTIST,ALBUM_TITLE,TYPE_MUSIC,RELEASE_YEAR"
                + " VALUES('" + newMusic.getIDTrack() +"','" 
                + newMusic.getIDPlaylist() +"','"+newMusic.getTitle()+"','"
                + newMusic.getTrackNumber() +"','"+newMusic.getArtist()+"','"
                + newMusic.getAlbumTitle() +"','" +newMusic.getTypeMusic()+"','"
                + newMusic.getReleaseYear()+"');";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
              System.out.println(ex.getErrorCode() + " error with the method create");
        }
        closeConnection();

        return music;
    }

    public Music update(Music upMusic) {
        String sql = "UPDATE MUSIC "
                +"SET ID_PLAYLIST='"+upMusic.getIDPlaylist()+"',"
                +"SET TITLE='"+upMusic.getTitle()+"',"
                +"SET TRACK_NUMBER='"+upMusic.getTrackNumber()+"',"
                +"SET ARTIST='"+upMusic.getArtist()+"',"
                +"SET ALBUM_TITLE='"+upMusic.getAlbumTitle()+"',"
                +"SET TYPE_MUSIC='"+upMusic.getTypeMusic()+"',"
                +"SET RELEASE_YEAR='"+upMusic.getReleaseYear()+"'"
                +"WHERE ID_TRACK='"+upMusic.getIDTrack()+"';";
        
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException e) {
              System.out.println(e.getErrorCode() + " error with the method update");
        }
        closeConnection();

        return upMusic;
    }

    public void delete(Music music) {
        String sql = "DELETE FROM MUSIC WHERE ID_TRACK = '"+music.getIDTrack()+"';";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        }catch (SQLException ex) {
             System.out.println(ex.getErrorCode() + " error with the method find");
        }
    }

    public List<Music> findAll() {
        List<Music> musics = new ArrayList();
        Music music = null;
        String sql = "SELECT * FROM MUSIC";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                music = new Music(
                        this.resultSet.getString("id_track"),
                        this.resultSet.getString("id_playlist"),
                        this.resultSet.getString("title"),
                        this.resultSet.getInt("track_number"),
                        this.resultSet.getString("artist"),
                        this.resultSet.getString("album_title"),
                        this.resultSet.getString("type_music"),
                        this.resultSet.getDate("release_year")
                        );
                musics.add(music);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the method findAll");
        }
        closeConnection();

        return musics;
    }

}