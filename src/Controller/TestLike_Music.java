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
        Like_Music likeMusic = like_musicDAO.find(1);
        System.out.println(likeMusic.getId_likelist());

        //TEST FOR CREATE
        likeMusic = new Like_Music(0, "T20000002", "M61", null);
        System.out.println(like_musicDAO.create(likeMusic).getId_likelist());

        //TEST FOR UPDATE
        likeMusic = new Like_Music(2, "T20000002", "M61", null); //id_likelist to be changed
        like_musicDAO.update(likeMusic);

        //TEST FOR DELETE
        likeMusic = new Like_Music(2, "T20000002", "M61", null); //id_likelist to be changed
        like_musicDAO.delete(likeMusic);

        //TEST FOR FIND ALL
        List<Like_Music> list_likeMusic = like_musicDAO.findAll();
        for (Like_Music aLikeMusic : list_likeMusic) {
            System.out.println(aLikeMusic.getId_likelist() + " - " + aLikeMusic.getId_music() + " - " + aLikeMusic.getTNumber());
        }
    }
}
