/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities_DAO.LibraryDAO;

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
        
       /* Library library = libraryDAO.findByTnumber("T10000000");
         System.out.println(library.getNickname());
        
         Administrator admin = adminDAO.findByTnumber("T20000000");
         System.out.println(admin.getNickname());   */   
        
        // -------------- TEST FOR CREATE ----------------
     /*  Member member = new Member("T00000012","nicknamemember3","password3",null,null,null,"addr3@gmail.com",null,null,null,null,null);
         System.out.println(memberDAO.create(member).getTnumber());
         */
        // -------------- TEST FOR UPDATE ----------------
        /*
        Member member = memberDAO.findByTnumber("T00000012");
        memberDAO.update(member);
*/
        // -------------- TEST FOR FINDALL ----------------
       /* List<Member> members0 = memberDAO.findAll();
        for (Member member0 : members0) {
            System.out.println(member0.getTnumber() + " - " + member0.getNickname() + " - " + member0.getPassword());
        }*/
         // -------------- TEST FOR DELET ----------------
      /*  Member member = memberDAO.findByTnumber("T00000012");
        memberDAO.delete(member);
      */
    }
}
