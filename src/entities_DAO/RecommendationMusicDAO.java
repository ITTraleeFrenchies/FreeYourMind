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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
        
        public RecommendationMusicDAO(){
            
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
        
	public RecommendationMusic find(int id) {
            RecommendationMusic recommend = null;
            String sql = "SELECT * FROM RECOMMENDATIONMUSIC WHERE ID_RECOMMENDATION = '" + id + "'";

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationMusic(
                            this.resultSet.getInt("idRecommendation"),
                            this.resultSet.getString("idMusic"),
                            this.resultSet.getDate("dateRecommend")
                            );
                    }
            } catch (SQLException ex) {
                    System.out.println(ex.getErrorCode() + " error with the sql request.");
            }
            closeConnection();
            
            return recommend;
	}
        
	public RecommendationMusic create(RecommendationMusic recommendationMusicCreate) {
            RecommendationMusic recommend = recommendationMusicCreate;
            String sql = " INSERT INTO RECOMMENDATIONMUSIC(ID_RECOMMENDATION,ID_MUSIC,DATE_RECOMMEND)"
                    + "VALUES('" + recommendationMusicCreate.getIDRecommendation() + "','"
                    + recommendationMusicCreate.getIDMusic() + "','" + recommendationMusicCreate.getDateRecommend() + "')";
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
        
	public RecommendationMusic update(RecommendationMusic recommendationMusicUpdate) {
    	
            String recommandationDate = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            if (recommendationMusicUpdate.getDateRecommend() != null) {
                recommandationDate = dateFormat.format(recommendationMusicUpdate.getDateRecommend());
            }
            
            String sql = " UPDATE RECOMMENDATIONMUSIC SET ID_RECOMMENDATION = '" + recommendationMusicUpdate.getIDRecommendation()
                    + "', ID_MUSIC = '" + recommendationMusicUpdate.getIDMusic()
                    + "', DATE_RECOMMEND = TO_DATE('" + recommandationDate + " 'yyyy/MM/dd')"
                    + "'";
            System.out.println(sql);
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            
            return recommendationMusicUpdate;   	
	}
        
	public RecommendationMusic delete(RecommendationMusic recommendationMusicDelete) {
            String sql = "DELETE FROM RECOMMENDATIONMUSIC WHERE ID_RECOMMENDATION = '" + recommendationMusicDelete.getIDRecommendation() + "'";
            System.out.println(sql);

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            
            return recommendationMusicDelete;
	}
	public List<RecommendationMusic> findAll() {
    	
            List<RecommendationMusic> recommends = new ArrayList();
            RecommendationMusic recommend = null;

            String sql="SELECT * FROM RECOMMENDATIONMUSIC";
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationMusic(
                            this.resultSet.getInt("idRecommendation"),
                            this.resultSet.getString("idMusic"),
                            this.resultSet.getDate("dateRecommend")
                            );
                    recommends.add(recommend);
                    }
            } catch (SQLException ex) {
                    System.out.println(ex.getErrorCode() + " error with the sql request.");
            }
            closeConnection();


            return recommends; 	
	}	
}
