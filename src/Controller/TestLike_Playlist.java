/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Like_Playlist;
import entities_DAO.Like_PlaylistDAO;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class TestLike_Playlist {

    public static void main(String[] args) {
        Like_PlaylistDAO like_playlistDAO = new Like_PlaylistDAO();

        //TEST FOR FIND BY ID_LIKELIST
        Like_Playlist likePlaylist = like_playlistDAO.find(1);
        System.out.println(likePlaylist.getId_likelist());

        //TEST FOR CREATE
        likePlaylist = new Like_Playlist("P182", "T20000002", null, null);
        System.out.println(like_playlistDAO.create(likePlaylist).getId_likelist());

        //TEST FOR UPDATE
        likePlaylist = new Like_Playlist("P182", "T20000002", null, null);
        like_playlistDAO.update(likePlaylist);

        //TEST FOR DELETE
        likePlaylist = new Like_Playlist("P182", "T20000002", null, null);
        like_playlistDAO.delete(likePlaylist);

        //TEST FOR FIND ALL
        List<Like_Playlist> list_likePlaylist = like_playlistDAO.findAll();
        for (Like_Playlist aLikePlaylist : list_likePlaylist) {
            System.out.println(aLikePlaylist.getId_likelist() + " - " + aLikePlaylist.getId_playlist() + " - " + aLikePlaylist.getTNumber());
        }
    }
}
