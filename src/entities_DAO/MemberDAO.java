/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import Controller.ConnectionDatabaseManager;
import entities.Member;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author t00178747
 */
public class MemberDAO {

    private String nameDriver = "jdbc:oracle:thin:@cp3dbinstance.c4pxnpz4ojk8.us-east-1.rds.amazonaws.com:1521:cp3db";
    private String username = "mm3";
    private String password = "mm3";
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public MemberDAO() {

    }

    public void openConnection() {
        try {
            this.connection = DriverManager.getConnection(nameDriver, username, password);
            this.statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the openning of  connection. ");
        }
    }

    public void closeConnection() {
        try {
            if (this.connection != null && this.statement != null && this.resultSet != null) {
                this.connection.close();
                this.statement.close();
                this.resultSet.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " : error with the closing of connection. ");
        }

    }
    public Member create(Member memberToCreate) {
        Member member = memberToCreate;
        String sql = " INSERT INTO MEMBER(TNUMBER,NICKNAME,PASSWORD,FIRSTNAME,"
                + "SURNAME,DATE_BIRTH,EMAIL_ADDR,STREET,CITY,COUNTY,SUBSCRIPTION_DATE,"
                + "PROFILE_PIC) VALUES('" + memberToCreate.getTnumber() + "','"
                + memberToCreate.getNickname() + "','" + memberToCreate.getPassword() + "','"
                + memberToCreate.getFirstname() + "','" + memberToCreate.getSurname() + "',"
                + memberToCreate.getDate_birth() + ",'" + memberToCreate.getEmail_addr() + "','"
                + memberToCreate.getStreet() + "','" + memberToCreate.getCity() + "','"
                + memberToCreate.getCounty() + "'," + memberToCreate.getSurbscription_date() + ","
                + memberToCreate.getProfile_pic() + ")";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return member;
    }

    public Member update(Member memberToUpdate) {
        Member memberToChange = findByTnumber(memberToUpdate.getTnumber());

        java.sql.Date sqlDateBirth = null;
        java.sql.Date sqlDateSubscription = null;
        if(memberToChange.getDate_birth()!= null){
            sqlDateBirth = new java.sql.Date(memberToChange.getDate_birth().getTime());
        }
        if(memberToChange.getSurbscription_date()!= null){
            sqlDateSubscription = new java.sql.Date(memberToChange.getSurbscription_date().getTime());
        }
        System.out.println(sqlDateSubscription);

        String sql = " UPDATE MEMBER SET NICKNAME = '" + memberToChange.getNickname()
                + "', PASSWORD = '" + memberToChange.getPassword()
                + "', FIRSTNAME = '" + memberToChange.getFirstname()
                + "', SURNAME = '" + memberToChange.getSurname()
                + "', DATE_BIRTH = TO_DATE("+ sqlDateBirth+", 'YYYY-MM-DD')" 
                + ", EMAIL_ADDR = '" + memberToChange.getEmail_addr()
                + "', STREET = '" + memberToChange.getStreet()
                + "', CITY = '" + memberToChange.getCity()
                + "', COUNTY = '" + memberToChange.getCounty()
                + "', SUBSCRIPTION_DATE = TO_DATE("+ sqlDateSubscription+", 'YYYY-MM-DD')" 
                + ",  PROFILE_PIC = " + memberToChange.getProfile_pic()
                + " WHERE TNUMBER = '" + memberToChange.getTnumber() + "'";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return memberToChange;
    }

    public Member delete(Member member) {
        return null;
    }

    public List<Member> findAll() {
        List<Member> members = new ArrayList();
        Member member = null;
        String sql = "SELECT * FROM MEMBER";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                member = new Member(
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nickname"),
                        this.resultSet.getString("password"),
                        this.resultSet.getString("firstname"),
                        this.resultSet.getString("surname"),
                        this.resultSet.getDate("date_birth"),
                        this.resultSet.getString("email_addr"),
                        this.resultSet.getString("street"),
                        this.resultSet.getString("city"),
                        this.resultSet.getString("county"),
                        this.resultSet.getDate("subscription_date"),
                        null);
                members.add(member);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return members;
    }

    public Member findByTnumber(String tnumber) {

        Member member = null;
        String sql = "SELECT * FROM MEMBER WHERE TNUMBER = '" + tnumber + "'";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);
            while (this.resultSet.next()) {
                member = new Member(
                        this.resultSet.getString("tnumber"),
                        this.resultSet.getString("nickname"),
                        this.resultSet.getString("password"),
                        this.resultSet.getString("firstname"),
                        this.resultSet.getString("surname"),
                        this.resultSet.getDate("date_birth"),
                        this.resultSet.getString("email_addr"),
                        this.resultSet.getString("street"),
                        this.resultSet.getString("city"),
                        this.resultSet.getString("county"),
                        this.resultSet.getDate("subscription_date"),
                        null);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode() + " error with the sql request.");
        }
        closeConnection();

        return member;
    }
}
