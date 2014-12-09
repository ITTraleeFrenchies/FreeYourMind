/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities_DAO;

import entities.Like_Music;
import java.util.List;
import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
/**
 *
 * @author t00178764
 */



public class Like_MusicDAO {
    
    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public Like_MusicDAO(){
        
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
    
    public Like_Music find(int id) {
        Like_Music likeMusic = null;
        String sql = "SELECT * FROM LIKELIST_MUSIC WHERE ID_LIKELIST = '" + id + "'";
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                likeMusic = new Like_Music(
                        this.resultSet.getInt("id_likelist"),
                        this.resultSet.getString("tNumber"),
                        this.resultSet.getString("id_music"),
                        this.resultSet.getDate("date_creation")
                );
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return likeMusic;
    }

    public Like_Music create(Like_Music likeMusicToCreate) {
        Like_Music likeMusic = likeMusicToCreate;
        String sql = " INSERT INTO LIKELIST_MUSIC"+
                " VALUES(" + likeMusicToCreate.getId_likelist()+ ",'"
                + likeMusicToCreate.getTNumber() + "','" + likeMusicToCreate.getId_music() + 
                "','" + likeMusicToCreate.getDate_creation() + "')";
                
        sql=sql.replace("'null'","null");
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return likeMusic;
    }

    public Like_Music update(Like_Music likeMusicUpdate) {
        String creationDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (likeMusicUpdate.getDate_creation() != null) {
            creationDate = dateFormat.format(likeMusicUpdate.getDate_creation());
        }
        
        String sql = " UPDATE LIKELIST_MUSIC SET TNUMBER = '" + likeMusicUpdate.getTNumber()
                + "', ID_MUSIC = '" + likeMusicUpdate.getId_music()
                + "', DATE_CREATION = TO_DATE('" + creationDate +"', 'yyyy/MM/dd')"
                + " WHERE ID_LIKELIST = '" + likeMusicUpdate.getId_likelist() + "'";
        
        sql=sql.replace("'null'","null");
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return likeMusicUpdate;
    }

    public Like_Music delete(Like_Music likeMusicToDelete) {
        String sql = "DELETE FROM LIKELIST_MUSIC WHERE ID_LIKELIST = '" + likeMusicToDelete.getId_likelist() + "'";
        System.out.println(sql);
        
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();
        
        return likeMusicToDelete;
    }

    public List<Like_Music> findAll() {
        List<Like_Music> likes = new ArrayList();
        Like_Music likeMusic = null;
        
        String sql="SELECT * FROM LIKELIST_MUSIC";
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                likeMusic = new Like_Music(
                        this.resultSet.getInt("id_likelist"),
                        this.resultSet.getString("tNumber"),
                        this.resultSet.getString("id_music"),
                        this.resultSet.getDate("date_creation")
                        );
                likes.add(likeMusic);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();
        
        
        return likes;
    }
}
