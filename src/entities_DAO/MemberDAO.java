/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities_DAO;

import entities.Member;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

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
        
        System.out.println(memberToCreate.getDate_birth());
        String sql = " INSERT INTO MEMBER VALUES('" + memberToCreate.getTnumber() + "','"
                + memberToCreate.getNickname() + "','" + memberToCreate.getPassword() + "','"
                + memberToCreate.getFirstname() + "','" + memberToCreate.getSurname() + "',"
                + memberToCreate.getDate_birth() + ",'" + memberToCreate.getEmail_addr() + "','"
                + memberToCreate.getStreet() + "','" + memberToCreate.getCity() + "','"
                + memberToCreate.getCounty() + "'," + memberToCreate.getSurbscription_date() + ","
                + memberToCreate.getProfile_pic() + ")";

        openConnection();
        System.out.println(sql);
        sql.replace("'null'", "null");
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return member;
    }

    public Member update(Member memberToUpdate) {

        String dateBirth = null;
        String dateSubscription = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        if (memberToUpdate.getDate_birth() != null) {
            dateBirth = dateFormat.format(memberToUpdate.getDate_birth());
        }
        if (memberToUpdate.getSurbscription_date() != null) {
            dateSubscription = dateFormat.format(memberToUpdate.getSurbscription_date());
        }
        String sql ="";
        if(dateBirth!=null && dateSubscription!=null){
        sql = " UPDATE MEMBER SET NICKNAME = '" + memberToUpdate.getNickname()
                + "', PASSWORD = '" + memberToUpdate.getPassword()
                + "', FIRSTNAME = '" + memberToUpdate.getFirstname()
                + "', SURNAME = '" + memberToUpdate.getSurname()
                + "', DATE_BIRTH = TO_DATE('" + dateBirth +"', 'yyyy/MM/dd')"
                + ", EMAIL_ADDR = '" + memberToUpdate.getEmail_addr()
                + "', STREET = '" + memberToUpdate.getStreet()
                + "', CITY = '" + memberToUpdate.getCity()
                + "', COUNTY = '" + memberToUpdate.getCounty()
                + "', SUBSCRIPTION_DATE = TO_DATE('" + dateSubscription +"', 'yyyy/MM/dd')"
                + ",  PROFILE_PIC = " + memberToUpdate.getProfile_pic()
                + " WHERE TNUMBER = '" + memberToUpdate.getTnumber() + "'";
        } else if(dateBirth==null && dateSubscription!=null){
        sql = " UPDATE MEMBER SET NICKNAME = '" + memberToUpdate.getNickname()
                + "', PASSWORD = '" + memberToUpdate.getPassword()
                + "', FIRSTNAME = '" + memberToUpdate.getFirstname()
                + "', SURNAME = '" + memberToUpdate.getSurname()
                + "', DATE_BIRTH = " + dateBirth +","
                + ", EMAIL_ADDR = '" + memberToUpdate.getEmail_addr()
                + "', STREET = '" + memberToUpdate.getStreet()
                + "', CITY = '" + memberToUpdate.getCity()
                + "', COUNTY = '" + memberToUpdate.getCounty()
                + "', SUBSCRIPTION_DATE = TO_DATE('" + dateSubscription +"', 'yyyy/MM/dd')"
                + ",  PROFILE_PIC = " + memberToUpdate.getProfile_pic()
                + " WHERE TNUMBER = '" + memberToUpdate.getTnumber() + "'";
        } else if(dateBirth!=null && dateSubscription==null){
        sql = " UPDATE MEMBER SET NICKNAME = '" + memberToUpdate.getNickname()
                + "', PASSWORD = '" + memberToUpdate.getPassword()
                + "', FIRSTNAME = '" + memberToUpdate.getFirstname()
                + "', SURNAME = '" + memberToUpdate.getSurname()
                + "', DATE_BIRTH = TO_DATE('" + dateBirth +"', 'yyyy/MM/dd')"
                + ", EMAIL_ADDR = '" + memberToUpdate.getEmail_addr()
                + "', STREET = '" + memberToUpdate.getStreet()
                + "', CITY = '" + memberToUpdate.getCity()
                + "', COUNTY = '" + memberToUpdate.getCounty()
                + "', SUBSCRIPTION_DATE " + dateSubscription +"'"
                + ",  PROFILE_PIC = " + memberToUpdate.getProfile_pic()
                + " WHERE TNUMBER = '" + memberToUpdate.getTnumber() + "'";
        }
        else{
             sql = " UPDATE MEMBER SET NICKNAME = '" + memberToUpdate.getNickname()
                + "', PASSWORD = '" + memberToUpdate.getPassword()
                + "', FIRSTNAME = '" + memberToUpdate.getFirstname()
                + "', SURNAME = '" + memberToUpdate.getSurname()
                + "', DATE_BIRTH = '" + dateBirth +"'"
                + ", EMAIL_ADDR = '" + memberToUpdate.getEmail_addr()
                + "', STREET = '" + memberToUpdate.getStreet()
                + "', CITY = '" + memberToUpdate.getCity()
                + "', COUNTY = '" + memberToUpdate.getCounty()
                + "', SUBSCRIPTION_DATE = '" + dateSubscription +"'"
                + ",  PROFILE_PIC = " + memberToUpdate.getProfile_pic()
                + " WHERE TNUMBER = '" + memberToUpdate.getTnumber() + "'";
        }
        System.out.println(sql);
        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return memberToUpdate;
    }

    public Member delete(Member memberToDelete) {
         Member member = memberToDelete;
        String sql = " DELETE FROM MEMBER WHERE TNUMBER ='" + member.getTnumber()+"'";

        openConnection();
        try {
            this.resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        closeConnection();

        return member;
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
