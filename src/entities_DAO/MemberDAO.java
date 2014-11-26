/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import Controller.ConnectionDatabaseManager;
import entities.Member;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t00178747
 */
public class MemberDAO {

    private ConnectionDatabaseManager connection;

    public MemberDAO(ConnectionDatabaseManager connection) {
        this.connection = connection;
        try {
            connection.connectionDatabase();
        } catch (SQLException ex) {
            Logger.getLogger(MemberDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Member find(String tnumber) {
        Member member =null;
        Image profile_pic = null;
        System.out.println(tnumber);
        try {
            ResultSet result = this.connection.getConnection().createStatement().executeQuery("SELECT * FROM MEMBER WHERE TNUMBER = " + tnumber);
            if (result.first()) {
                member = new Member(
                        tnumber,
                        result.getString("nickname"),
                        result.getString("password"),
                        result.getString("firstname"),
                        result.getString("surname"),
                        result.getDate("date_birth"),
                        result.getString("email_addr"),
                        result.getString("street"),
                        result.getString("city"),
                        result.getString("county"),
                        result.getDate("subscription_date"),
                        profile_pic
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return member;
    }

    public Member create(Member member) {
        return null;
    }

    public Member update(Member member) {
        return null;
    }

    public Member delete(Member member) {
        return null;
    }

    public List<Member> findAll() {
        return null;
    }

    public List<Member> findById() {
        return null;
    }
}
