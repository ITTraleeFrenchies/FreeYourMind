/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Member;
import entities_DAO.MemberDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestEverything {

    

    public static void main(String[] args) {
       // ConnectionDatabaseManager connect = new ConnectionDatabaseManager();
        
        MemberDAO memberDAO= new MemberDAO();
        // -------------- TEST FOR FINDALL ----------------
       /* List<Member> members =  memberDAO.findAll();
        for (Member member : members){
            System.out.println(member.getTnumber());
        }
        */
        // -------------- TEST FOR FINDBYTNUMBER ----------------
        /*
        Member member = memberDAO.findByTnumber("T10000000");
        System.out.println(member.getNickname());
                */
        // -------------- TEST FOR CREATE ----------------
        Member member = new Member("T0000012","nicknamemember3","password3",null,null,null,"addr3@gmail.com",null,null,null,null,null);
        System.out.println(memberDAO.create(member));
    }
}
