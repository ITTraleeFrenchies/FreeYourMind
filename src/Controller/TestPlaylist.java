/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Playlist;
import entities_DAO.PlaylistDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t00178764
 */
public class TestPlaylist {
    public static void main(String[] args) {
        PlaylistDAO playlistDAO = new PlaylistDAO();
        
        //TEST FOR FIND 
        Playlist playlist = playlistDAO.find("P224");
        System.out.println(playlist.getIDPlaylist());
        
        //TEST FOR CREATE
       /* Playlist playlist = new Playlist(null,81,"electro",null,false); //wrong library id, to be changed when db available
        System.out.println(playlistDAO.create(playlist).getIDPlaylist());*/
        
        //TEST FOR UPDATE
        /*Playlist playlist=new Playlist("P184",89,"dub",null,false);//wrong library id, to be changed when db available. playlist id to check
        playlistDAO.update(playlist);*/
        
        //TEST FOR DELETE
       /* Playlist playlist=new Playlist("P184",89,"dub",null,false);//wrong library id, to be changed when db available. playlist id to check
        System.out.println(playlistDAO.delete(playlist).getIDPlaylist());*/
        
        //TEST FOR FIND ALL
        /* List<Playlist> playlists0 = playlistDAO.findAll();
        for (Playlist playlist0 : playlists0) {
            System.out.println(playlist0.getIDPlaylist() + " - " + playlist0.getIDPlaylist() + " - " + playlist0.getIDPlaylist());
    }*/
    }
}

