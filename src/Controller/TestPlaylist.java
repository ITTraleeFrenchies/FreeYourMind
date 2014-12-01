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
        
        //TEST FOR FIND BY TNUMBER
        /*Playlist playlist = playlistDAO.find("P182");
        System.out.println(playlist.getIDPlaylist());*/ 
        
        //TEST FOR CREATE
        /*Playlist playlist = new Playlist("T20000002","nicknameplaylist3","password3","addrplaylist3@gmail.com");
        System.out.println(playlistDAO.create(playlist).getTnumber());*/
        
        //TEST FOR UPDATE
        /*Playlist playlist=new Playlist("T20000002","nicknameplaylist4","password4","addrplaylist4@gmail.com");
        playlistDAO.update(playlist);*/
        
        //TEST FOR DELETE
        /*Playlist playlist=new Playlist("T20000002","nicknameplaylist4","password4","addrplaylist4@gmail.com");
        System.out.println(playlistDAO.delete(playlist).getTnumber());*/
        
        //TEST FOR FIND ALL
        /* List<Playlist> playlists0 = playlistDAO.findAll();
        for (Playlist playlist0 : playlists0) {
            System.out.println(playlist0.getTnumber() + " - " + playlist0.getNickname() + " - " + playlist0.getPassword());
    }*/
    }
}

