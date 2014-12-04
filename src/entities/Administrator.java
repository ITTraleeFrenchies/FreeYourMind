/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

/**
 *
 * @author t00178747
 */
public class Administrator {
    private String Tnumber;
    private String nickname;
    private String password;
    private String email_address;

    public Administrator(String Tnumber, String nickname, String password, String email_addr) {
        this.Tnumber = Tnumber;
        this.nickname = nickname;
        this.password = password;
        this.email_address = email_addr;
    }

    public Administrator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    
    
}
