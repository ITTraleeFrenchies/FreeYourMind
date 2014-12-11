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
            String sql = "SELECT * FROM RECOMMENDATION_MUSIC WHERE ID_RECOMMENDATION = " + id ;

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationMusic(
                            id,
                            this.resultSet.getString("id_Music"),
                            this.resultSet.getDate("date_Recommend")
                            );
                    }
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            
            return recommend;
	}
        
	public RecommendationMusic create(RecommendationMusic recommendationMusicCreate) {
            RecommendationMusic recommend = recommendationMusicCreate;
            String sql = " INSERT INTO RECOMMENDATION_MUSIC"
                    + " VALUES(" + recommendationMusicCreate.getIDRecommendation() + ",'"
                    + recommendationMusicCreate.getIDMusic() + "','" + recommendationMusicCreate.getDateRecommend() + "')";
            
            sql=sql.replace("'null'","null");
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
            
            String sql = " UPDATE RECOMMENDATION_MUSIC "
                    + "SET ID_MUSIC = '" + recommendationMusicUpdate.getIDMusic()
                    + "', DATE_RECOMMEND = TO_DATE('" + recommandationDate + "', 'yyyy/MM/dd')"
                    + " WHERE ID_RECOMMENDATION = " + recommendationMusicUpdate.getIDRecommendation();
            
            sql=sql.replace("'null'","null");
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
            String sql = "DELETE FROM RECOMMENDATION_MUSIC WHERE ID_RECOMMENDATION = '" + recommendationMusicDelete.getIDRecommendation() + "'";
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

            String sql="SELECT * FROM RECOMMENDATION_MUSIC";
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationMusic(
                            this.resultSet.getInt("id_Recommendation"),
                            this.resultSet.getString("id_Music"),
                            this.resultSet.getDate("date_Recommend")
                            );
                    recommends.add(recommend);
                    }
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();


            return recommends; 	
	}	
}
