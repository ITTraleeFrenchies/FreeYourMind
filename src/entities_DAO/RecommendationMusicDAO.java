/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.RecommendationMusic;
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
public class RecommendationMusicDAO {

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

    public RecommendationMusic find(long id) {
        return null;
    }

    public RecommendationMusic create(RecommendationMusic recommendationMusic) {
        RecommendationMusic recommend = recommendationMusic;
        String sql = " INSERT INTO RECOMMENDATIONMUSIC(ID_RECOMMENDATION,ID_MUSIC,DATE_RECOMMEND)"
                + "VALUES('" + recommendationMusic.getIDRecommendation() + "','"
                + recommendationMusic.getIDMusic() + "','" + recommendationMusic.getDateRecommend() + "')";

        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return recommend;
    }

    public RecommendationMusic update(RecommendationMusic recommendationMusic) {
        return null;
    }

    public void delete(RecommendationMusic recommendationMusic) {
    }

    public List<RecommendationMusic> findAll() {
        return null;
    }

    public List<RecommendationMusic> findById() {
        return null;
    }
}
