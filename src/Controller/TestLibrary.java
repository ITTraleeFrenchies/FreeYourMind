/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Library;
import entities_DAO.LibraryDAO;
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

         // -------------- TEST FOR FIND BY ID ----------------
        Library library = libraryDAO.findById(1);
        System.out.println(library.get_name());

        // -------------- TEST FOR CREATE ----------------
       /* library = new Library(12, "myLibrary", "T00000012");
        System.out.println(libraryDAO.create(library).get_id_library());
        */
        // -------------- TEST FOR UPDATE ----------------
        library = libraryDAO.findById(1);
        libraryDAO.update(library);

        // -------------- TEST FOR FINDALL ----------------
        List<Library> libraries = libraryDAO.findAll();
        for (Library aLibrary : libraries) {
            System.out.println(aLibrary.get_id_library() + " - " + aLibrary.get_name() + " - " + aLibrary.get_member());
        }

        // -------------- TEST FOR DELETE ----------------
        library = libraryDAO.findById(1);
        libraryDAO.delete(library);

    }
}
