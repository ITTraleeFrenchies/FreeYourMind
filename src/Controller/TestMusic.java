/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Music;
import entities_DAO.MusicDAO;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class TestMusic {

    public static void main(String[] args) {
        MusicDAO musicDAO = new MusicDAO();

        // -------------- TEST FOR FIND BY IDTRACK ----------------
        Music music = musicDAO.find("M61");
        System.out.println(music.getIDTrack() + " - " + music.getTitle());

        // -------------- TEST FOR CREATE ----------------
        music = new Music(null, null, "STupeflip vite", 1, null, null, null, null);
        System.out.println(musicDAO.create(music).getIDTrack());

        // -------------- TEST FOR UPDATE ----------------
        
         music = musicDAO.find("M61");
         musicDAO.update(music);
         
        // -------------- TEST FOR FINDALL ----------------
        List<Music> listMusic = musicDAO.findAll();
         for (Music aMusic : listMusic) {
         System.out.println(aMusic.getIDTrack() + " - " + aMusic.getTitle()+ " - " + aMusic.getIDPlaylist());
         }
         
        // -------------- TEST FOR DELETE ----------------
         music = musicDAO.find("M61");
         musicDAO.delete(music);
         
    }
}
