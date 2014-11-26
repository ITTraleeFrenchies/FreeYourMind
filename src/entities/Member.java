/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author t00178747
 */
public class Member {
    private String Tnumber;
    private String nickname;
    private String password;
    private String firstname;
    private String surname;
    private Date date_birth;
    private String email_addr;
    private String street;
    private String city;
    private String county;
    private Date surbscription_date;
    private Image profile_pic;

    public Member(String Tnumber, String nickname, String password, String firstname, String surname, Date date_birth, String email_addr, String street, String city, String county, Date surbscription_date, Image profile_pic) {
        this.Tnumber = Tnumber;
        this.nickname = nickname;
        this.password = password;
        this.firstname = firstname;
        this.surname = surname;
        this.date_birth = date_birth;
        this.email_addr = email_addr;
        this.street = street;
        this.city = city;
        this.county = county;
        this.surbscription_date = surbscription_date;
        this.profile_pic = profile_pic;
    }

    public Member() {
       
    }


    public String getTnumber() {
        return Tnumber;
    }

    public void setTnumber(String Tnumber) {
        this.Tnumber = Tnumber;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    public String getEmail_addr() {
        return email_addr;
    }

    public void setEmail_addr(String email_addr) {
        this.email_addr = email_addr;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Date getSurbscription_date() {
        return surbscription_date;
    }

    public void setSurbscription_date(Date surbscription_date) {
        this.surbscription_date = surbscription_date;
    }

    public Image getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(Image profile_pic) {
        this.profile_pic = profile_pic;
    }
    
    
}
