/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Playlist;
import entities_DAO.PlaylistDAO;
import java.util.List;

/**
 *
 * @author t00178764
 */
public class TestPlaylist {

    public static void main(String[] args) {
        PlaylistDAO playlistDAO = new PlaylistDAO();
        Playlist playlist = null;
        //TEST FOR FIND 
      /*  Playlist playlist = playlistDAO.find("P224");
         System.out.println(playlist.getIDPlaylist());
         // ==========================================
        //TEST FOR CREATE
         playlist = new Playlist(null,81,"dub",null,false); //wrong library id, to be changed when db available
         System.out.println(playlistDAO.create(playlist).getIDPlaylist());
         // ===============================================
        //TEST FOR UPDATE
         playlist= playlistDAO.find("P224");
         playlist.setName("reggae");
         playlistDAO.update(playlist);*/
         // ======================================
        //TEST FOR DELETE
       /* playlist= playlistDAO.find("P225");
         System.out.println(playlistDAO.delete(playlist).getIDPlaylist());
        // =====================================================
        */
        //TEST FOR FIND ALL
        List<Playlist> playlists0 = playlistDAO.findAll();
        for (Playlist playlist0 : playlists0) {
            System.out.println(playlist0.getIDPlaylist() + " - " + playlist0.getIDLibrary()+ " - " + playlist0.getName()
            + " - " + playlist0.getCreationDate());
        }
    }
}
