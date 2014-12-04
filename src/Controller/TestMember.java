/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import entities.Member;
import entities_DAO.AdministratorDAO;
import entities_DAO.MemberDAO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author t00178747
 */
public class TestMember {

    public static void main(String[] args) {
        
        /*
        
        UPDATE DATE FORMAT :
        ALTER SESSION SET NLS_DATE_FORMAT = 'yyyy/MM/dd';
            select sysdate from dual;
        
        */
        
        MemberDAO memberDAO = new MemberDAO();
        
         // -------------- TEST FOR FINDBYTNUMBER ----------------
        
        /*Member member = memberDAO.findByTnumber("T10000000");
         System.out.println(member.getNickname());*/
        
        
        // -------------- TEST FOR CREATE ----------------
      /* Member member = new Member("T10000000","nicknamemember2","password2",null,null,null,"addr1@gmai2.com",null,null,null,null,null);
         System.out.println(memberDAO.create(member).getTnumber());*/
         
        // -------------- TEST FOR UPDATE ----------------
        
        /*Member member=new Member("T10000001","nicknameadmin3","password3",null,null,new Date("1993/12/04"),"addradmin3@gmail.com",null,null,null,new Date("2014/12/04"),null);
        memberDAO.update(member);*/

        // -------------- TEST FOR FINDALL ----------------
       /* List<Member> members0 = memberDAO.findAll();
        for (Member member0 : members0) {
            System.out.println(member0.getTnumber() + " - " + member0.getNickname() + " - " + member0.getPassword());
        }*/
         // -------------- TEST FOR DELETE ----------------
       /* Member member = memberDAO.findByTnumber("T10000001");
        memberDAO.delete(member);*/
      
    }
}
