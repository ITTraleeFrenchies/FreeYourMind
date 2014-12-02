/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.RecommendationPlaylist;
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

public class RecommendationPlaylistDAO {
	
	private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
	private String username = "mm3";
	private String password = "mm3";
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
        
        public RecommendationPlaylistDAO(){
            
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
	
   	public RecommendationPlaylist find(int id) {
       	
            RecommendationPlaylist recommend = null;
            String sql = "SELECT * FROM RECOMMENDATIONPLAYLIST WHERE ID_RECOMMENDATION = '" + id + "'";

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationPlaylist(
                            this.resultSet.getInt("idRecommendation"),
                            this.resultSet.getString("idPlaylist"),
                            this.resultSet.getDate("dateRecommend")
                            );
                    }
            } catch (SQLException ex) {
                    System.out.println(ex.getErrorCode() + " error with the sql request.");
            }
            closeConnection();
            
            return recommend;
	}
	
        
        public RecommendationPlaylist create(RecommendationPlaylist recommendationPlaylistCreate) {
    	
            RecommendationPlaylist recommend = recommendationPlaylistCreate;
            String sql = " INSERT INTO RECOMMENDATIONMUSIC(ID_RECOMMENDATION,ID_PLAYLIST,DATE_RECOMMEND)"
                    + "VALUES('" + recommendationPlaylistCreate.getIDRecommendation() + "','"
                    + recommendationPlaylistCreate.getIDPlaylist() + "','" + recommendationPlaylistCreate.getDateRecommend() + "')";
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
	
        public RecommendationPlaylist update(RecommendationPlaylist recommendationPlaylistUpdate) {
            String recommandationDate = null;
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            if (recommendationPlaylistUpdate.getDateRecommend() != null) {
                recommandationDate = dateFormat.format(recommendationPlaylistUpdate.getDateRecommend());
            }
            
            String sql = " UPDATE RECOMMENDATIONPLAYLIST SET ID_RECOMMENDATION = '" + recommendationPlaylistUpdate.getIDRecommendation()
                    + "', ID_PLAYLIST = '" + recommendationPlaylistUpdate.getIDPlaylist()
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
            
            return recommendationPlaylistUpdate;
	}
        
        
	public RecommendationPlaylist delete(RecommendationPlaylist recommendationPlaylistDelete) {
    	
            String sql = "DELETE FROM RECOMMENDATIONPLAYLIST WHERE ID_RECOMMENDATION = '" + recommendationPlaylistDelete.getIDRecommendation() + "'";
            System.out.println(sql);

            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
            } catch (SQLException ex) {
                    ex.printStackTrace();
            }
            closeConnection();
            
            return recommendationPlaylistDelete;    	
	}
        
	public List<RecommendationPlaylist> findAll() {
    	
            List<RecommendationPlaylist> recommends = new ArrayList();
            RecommendationPlaylist recommend = null;

            String sql="SELECT * FROM RECOMMENDATIONMUSIC";
            openConnection();
            try {
                    this.resultSet = statement.executeQuery(sql);
                    while (this.resultSet.next()) {
                    recommend = new RecommendationPlaylist(
                            this.resultSet.getInt("idRecommendation"),
                            this.resultSet.getString("idPlaylist"),
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

