/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import entities.Music;
import entities_DAO.MusicDAO;

/**
 *
 * @author t00178747
 */
public class TestMusic {
         MusicDAO musicDAO = new MusicDAO();
    
     // -------------- TEST FOR FIND BY IDTRACK ----------------
        
        Music music = musicDAO.find("M1");
        
          
        
        // -------------- TEST FOR CREATE ----------------
     /*  music = new Member("T00000012","nicknamemember3","password3",null,null,null,"addr3@gmail.com",null,null,null,null,null);
         System.out.println(musicDAO.create(member).getTnumber());
         */
        // -------------- TEST FOR UPDATE ----------------
        /*
        music = musicDAO.findByTnumber("T00000012");
        musicDAO.update(member);
*/
        // -------------- TEST FOR FINDALL ----------------
       /* List<Music> members0 = musicDAO.findAll();
        for (Music music : members0) {
            System.out.println(member0.getTnumber() + " - " + member0.getNickname() + " - " + member0.getPassword());
        }*/
         // -------------- TEST FOR DELET ----------------
      /*  Music music = musicDAO.findByTnumber("T00000012");
        memberDAO.delete(member);
      */
}
