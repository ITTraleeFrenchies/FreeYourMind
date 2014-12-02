/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.RecommendationPlaylist;
import entities_DAO.RecommendationPlaylistDAO;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class Test_RecommendationPlaylist {
      public static void main(String[] args) {
        RecommendationPlaylistDAO recomPlaylistDAO = new RecommendationPlaylistDAO();

        // -------------- TEST FOR FIND BY IDTRACK ----------------
        RecommendationPlaylist recomMusic = recomPlaylistDAO.find(1);
        System.out.println(recomMusic.getIDRecommendation() + " - " + recomMusic.getIDPlaylist()
        + " - " + recomMusic.getDateRecommend());

        // -------------- TEST FOR CREATE ----------------
        recomMusic = new RecommendationPlaylist(0, null, null);
        System.out.println(recomPlaylistDAO.create(recomMusic).getIDRecommendation());

        // -------------- TEST FOR UPDATE ----------------
        
         recomMusic = recomPlaylistDAO.find(1);
         recomPlaylistDAO.update(recomMusic);
         
        // -------------- TEST FOR FINDALL ----------------
        List<RecommendationPlaylist> listRecomMusic = recomPlaylistDAO.findAll();
         for (RecommendationPlaylist aRecomPlaylist : listRecomMusic) {
         System.out.println(aRecomPlaylist.getIDRecommendation() + " - " + aRecomPlaylist.getIDPlaylist()+ " - " + aRecomPlaylist.getDateRecommend());
         }
         
        // -------------- TEST FOR DELETE ----------------
         recomMusic = recomPlaylistDAO.find(1);
         recomPlaylistDAO.delete(recomMusic);
         
    } 
}
