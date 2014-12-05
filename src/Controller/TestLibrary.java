/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Library;
import entities.Member;
import entities_DAO.LibraryDAO;
import entities_DAO.MemberDAO;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class TestLibrary {

    public static void main(String[] args) {

        /*
        
         UPDATE DATE FORMAT :
         ALTER SESSION SET NLS_DATE_FORMAT = 'yyyy/MM/dd';
         select sysdate from dual;
        
         */
        LibraryDAO libraryDAO = new LibraryDAO();
        Library library = null;

         // -------------- TEST FOR FIND BY ID ----------------
        /*library = libraryDAO.findById(81);
         System.out.println(library.getName());*/
        //================= WE DO NOT CREATE MANUALLY HERE ================
        // -------------- TEST FOR CREATE ----------------
       /* library = new Library(12, "myLibrary", "T00000012");
         System.out.println(libraryDAO.create(library).get_id_library());
         */
        // -------------- TEST FOR UPDATE ----------------
       /* library = libraryDAO.findById(81);
         library.setName("Library updated");
         libraryDAO.update(library);*/
        // -------------- TEST FOR DELETE ----------------
       /*  MemberDAO memberDAO = new MemberDAO();
         Member member = new Member("T10000022","nicknamemember3","password2",null,null,null,"addr1@gmai2.com",null,null,null,null,null);
         System.out.println(memberDAO.create(member).getTnumber());*/
       /* library = libraryDAO.findById(92);
        libraryDAO.delete(library);*/

        // -------------- TEST FOR FINDALL ----------------
        List<Library> libraries = libraryDAO.findAll();
        for (Library aLibrary : libraries) {
            System.out.println(aLibrary.getId_library() + " - " + aLibrary.getName() + " - " + aLibrary.getMember());
        }

    }
}
