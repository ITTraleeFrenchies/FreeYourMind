/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Music;
import entities_DAO.MusicDAO;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t00178747
 */
public class TestMusic {

    public static void main(String[] args) throws FileNotFoundException {
        MusicDAO musicDAO = new MusicDAO();
           Music music = null;
        
           
          
        // -------------- TEST FOR FIND BY IDTRACK ----------------
        /* music = musicDAO.find("M94");
        System.out.println(music.getIDTrack() + " - " + music.getTitle());*/

        // -------------- TEST FOR CREATE ----------------
        /*music = new Music(null, null, "Auto Rock", 3, null, null, null, null,null);
        System.out.println(musicDAO.create(music).getIDTrack());*/

        // -------------- TEST FOR UPDATE ----------------
        
       /*  music = new Music("M92","P231", "Tracy", 7, null, null, null, null,null);
         musicDAO.update(music);*/
        // -------------- TEST FOR DELETE ----------------
        /*music = musicDAO.find("M94");
        System.out.println(musicDAO.delete(music).getIDTrack());*/
         
           // -------------- TEST FOR FINDALL ----------------
        List<Music> listMusic = musicDAO.findAll();
         for (Music aMusic : listMusic) {
         System.out.println(aMusic.getIDTrack() + " - " + aMusic.getTitle()+ " - " + aMusic.getIDPlaylist());
         }
         
    }
}
