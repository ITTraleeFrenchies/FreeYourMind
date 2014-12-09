/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Like_Music;
import entities_DAO.Like_MusicDAO;
import java.util.List;

/**
 *
 * @author t00178764
 */
public class TestLike_Music {

    public static void main(String[] args) {
        Like_MusicDAO like_musicDAO = new Like_MusicDAO();

        //TEST FOR FIND BY ID_LIKELIST
       /* Like_Music likeMusic = like_musicDAO.find(21);
        System.out.println(likeMusic.getId_likelist());*/

        //TEST FOR CREATE
        /*Like_Music likeMusic = new Like_Music(0, "T10000002", "M92", null);
        System.out.println(like_musicDAO.create(likeMusic).getId_likelist());*/

        //TEST FOR UPDATE
        /*Like_Music likeMusic = new Like_Music(21, "T10000002", "M81", null); 
        like_musicDAO.update(likeMusic);*/

        //TEST FOR DELETE
        Like_Music likeMusic = new Like_Music(22, "T10000002", "M92", null); 
        like_musicDAO.delete(likeMusic);

        //TEST FOR FIND ALL
        List<Like_Music> list_likeMusic = like_musicDAO.findAll();
        for (Like_Music aLikeMusic : list_likeMusic) {
            System.out.println(aLikeMusic.getId_likelist() + " - " + aLikeMusic.getId_music() + " - " + aLikeMusic.getTNumber());
        }
    }
}
