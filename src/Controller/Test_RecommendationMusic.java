/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.RecommendationMusic;
import entities_DAO.RecommendationMusicDAO;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class Test_RecommendationMusic {
    
   
    public static void main(String[] args) {
        RecommendationMusicDAO recomMusicDAO = new RecommendationMusicDAO();

        // -------------- TEST FOR FIND BY IDTRACK ----------------
        RecommendationMusic recomMusic = recomMusicDAO.find(1);
        System.out.println(recomMusic.getIDMusic() + " - " + recomMusic.getIDRecommendation());

        // -------------- TEST FOR CREATE ----------------
        recomMusic = new RecommendationMusic(0, null, null);
        System.out.println(recomMusicDAO.create(recomMusic).getIDMusic());

        // -------------- TEST FOR UPDATE ----------------
        
         recomMusic = recomMusicDAO.find(1);
         recomMusicDAO.update(recomMusic);
         
        // -------------- TEST FOR FINDALL ----------------
        List<RecommendationMusic> listRecomMusic = recomMusicDAO.findAll();
         for (RecommendationMusic aRecomMusic : listRecomMusic) {
         System.out.println(aRecomMusic.getIDMusic() + " - " + aRecomMusic.getIDRecommendation()+ " - " + aRecomMusic.getDateRecommend());
         }
         
        // -------------- TEST FOR DELETE ----------------
         recomMusic = recomMusicDAO.find(1);
         recomMusicDAO.delete(recomMusic);
         
    } 
}
