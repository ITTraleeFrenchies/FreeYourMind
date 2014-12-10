/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import entities.Member;
import entities_DAO.MemberDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author t00178747
 */
public class Subscribe extends javax.swing.JPanel {

    /**
     * Creates new form LogIn
     */
    public boolean canBeConnected = false;

    public Subscribe() throws IOException {
        initComponents();
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(Color.LIGHT_GRAY);
        this.l_error.setVisible(false);

        // ========== FOR THE IMAGE AND UPLOAD =============
        JLabel l_loadImage = new JLabel("Select an image from your Computer");
        JButton b_loadImage = new JButton("Load");
        l_loadImage.setBounds(340, 280, 250, 15);
        b_loadImage.setBounds(560, 280, 70, 20);
        this.add(l_loadImage);
        this.add(b_loadImage);

        BufferedImage img = null;
        img = ImageIO.read(new File("src/Ressources/rsz_profile_image.png"));
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);

        label.setBounds(400, 100, 233, 216);
        this.add(label);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_title = new javax.swing.JLabel();
        l_subscribe = new javax.swing.JLabel();
        l_tnumber = new javax.swing.JLabel();
        l_password = new javax.swing.JLabel();
        l_password1 = new javax.swing.JLabel();
        l_nickname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        l_name = new javax.swing.JLabel();
        l_surname = new javax.swing.JLabel();
        l_dateBirth = new javax.swing.JLabel();
        l_email = new javax.swing.JLabel();
        l_street = new javax.swing.JLabel();
        l_city = new javax.swing.JLabel();
        l_county = new javax.swing.JLabel();
        b_subscribe = new javax.swing.JButton();
        b_backHome = new javax.swing.JButton();
        t_tnumber = new javax.swing.JTextField();
        t_nickname = new javax.swing.JTextField();
        t_name = new javax.swing.JTextField();
        t_surname = new javax.swing.JTextField();
        t_dateBirth = new javax.swing.JTextField();
        t_email = new javax.swing.JTextField();
        t_street = new javax.swing.JTextField();
        t_city = new javax.swing.JTextField();
        t_county = new javax.swing.JTextField();
        l_asterix = new javax.swing.JLabel();
        l_asterix1 = new javax.swing.JLabel();
        l_asterix2 = new javax.swing.JLabel();
        l_asterix3 = new javax.swing.JLabel();
        l_indication = new javax.swing.JLabel();
        l_indication1 = new javax.swing.JLabel();
        l_indication2 = new javax.swing.JLabel();
        l_asterix4 = new javax.swing.JLabel();
        l_asterix5 = new javax.swing.JLabel();
        l_asterix6 = new javax.swing.JLabel();
        l_asterix7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        l_error = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        setPreferredSize(new java.awt.Dimension(700, 700));

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_subscribe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l_subscribe.setText("Subscribe");

        l_tnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tnumber.setText("T-Number: ");

        l_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_password.setText("Password: ");

        l_password1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_password1.setText("Password (again):");

        l_nickname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_nickname.setText("Nickname:");

        l_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_name.setText("Name:");

        l_surname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_surname.setText("Surname:");

        l_dateBirth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_dateBirth.setText("Date of birth:");

        l_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_email.setText("Email:");

        l_street.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_street.setText("Street:");

        l_city.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_city.setText("City:");

        l_county.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_county.setText("County:");

        b_subscribe.setText("Subscribe");
        b_subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_subscribeActionPerformed(evt);
            }
        });

        b_backHome.setText("Back home");

        t_tnumber.setToolTipText("");

        t_nickname.setToolTipText("");

        t_name.setToolTipText("");

        t_surname.setToolTipText("");

        t_dateBirth.setToolTipText("");

        t_email.setToolTipText("");

        t_street.setToolTipText("");

        t_city.setToolTipText("");

        t_county.setToolTipText("");

        l_asterix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix.setText("*");

        l_asterix1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix1.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix1.setText("*");

        l_asterix2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix2.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix2.setText("*");

        l_asterix3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix3.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix3.setText("*");

        l_indication.setText("(This information will be only visible for you)");

        l_indication1.setText("(This information will be only visible for you)");

        l_indication2.setText("(dd/mm/yyyy)");

        l_asterix4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix4.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix4.setText("*");

        l_asterix5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix5.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix5.setText("*");

        l_asterix6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix6.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix6.setText("*");

        l_asterix7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_asterix7.setForeground(new java.awt.Color(204, 0, 0));
        l_asterix7.setText("*");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Fiels marqued by this asterix must are mandatory");

        l_error.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_error.setForeground(new java.awt.Color(204, 0, 0));
        l_error.setText("Error : fill correctly all the mandatory field");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(l_title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_subscribe)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_password1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_asterix2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_nickname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_asterix3))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_name, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l_indication)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_asterix4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_surname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_surname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_indication1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_asterix5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_dateBirth)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_dateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_indication2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_county)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(t_county, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_asterix7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(29, 29, 29)
                                .addComponent(b_backHome)
                                .addGap(18, 18, 18)
                                .addComponent(b_subscribe))
                            .addComponent(l_error)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_asterix6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_street)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_street, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_city)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_city, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(l_password)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l_tnumber)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_asterix)
                                    .addComponent(l_asterix1, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(l_title)
                .addGap(29, 29, 29)
                .addComponent(l_subscribe)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tnumber)
                    .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_asterix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_password)
                    .addComponent(l_asterix1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_password1)
                    .addComponent(l_asterix2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nickname)
                    .addComponent(t_nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_asterix3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_name)
                    .addComponent(t_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_indication)
                    .addComponent(l_asterix4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_surname)
                    .addComponent(t_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_indication1)
                    .addComponent(l_asterix5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_dateBirth)
                    .addComponent(t_dateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_indication2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_email)
                    .addComponent(t_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_asterix6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_street)
                    .addComponent(t_street, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_county)
                    .addComponent(t_county, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_city)
                    .addComponent(t_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(l_error)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_subscribe)
                    .addComponent(l_asterix7)
                    .addComponent(jLabel1)
                    .addComponent(b_backHome))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_subscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_subscribeActionPerformed
        String tnumber = "";
        String password = "";
        String nickname = "";
        String firstname = "";
        String surname = "";
        Date dateBirth = null;
        String email = "";
        String street = "";
        String city = "";
        String county = "";
        String country = "";

        tnumber = this.t_tnumber.getText();
        password = this.jPasswordField1.getText();
        nickname = this.t_nickname.getText();
        firstname = this.t_name.getText();
        surname = this.t_surname.getText();
        email = this.t_email.getText();
        street = this.t_street.getText();
        city = this.t_city.getText();
        county = this.t_county.getText();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
        String dateInString = "";
        dateInString = this.t_dateBirth.getText();
        if (!dateInString.equalsIgnoreCase("")) {
            try {
                dateBirth = formatter.parse(dateInString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
         MemberDAO memberDAO = new MemberDAO();
         Member member = null;
        
        if (!tnumber.equalsIgnoreCase("") && !password.equalsIgnoreCase("")
                && !nickname.equalsIgnoreCase("") && !this.jPasswordField2.getText().equalsIgnoreCase("")
                && !email.equalsIgnoreCase("")) {
            member = new Member();
            member.setTnumber(tnumber);
            member.setPassword(password);
            member.setNickname(nickname);
            member.setFirstname(firstname);
            member.setSurname(surname);
            member.setEmail_addr(email);
            member.setStreet(street);
            member.setCity(city);
            member.setCounty(county);
        }else{
              this.l_error.setVisible(true);
        }
        
        if(member != null && memberDAO.findByTnumber(tnumber) ==null && password.equalsIgnoreCase(this.jPasswordField2.getText())){
            memberDAO.create(member);
             canBeConnected = true;
        }
        

    }//GEN-LAST:event_b_subscribeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_backHome;
    public javax.swing.JButton b_subscribe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l_asterix;
    private javax.swing.JLabel l_asterix1;
    private javax.swing.JLabel l_asterix2;
    private javax.swing.JLabel l_asterix3;
    private javax.swing.JLabel l_asterix4;
    private javax.swing.JLabel l_asterix5;
    private javax.swing.JLabel l_asterix6;
    private javax.swing.JLabel l_asterix7;
    private javax.swing.JLabel l_city;
    private javax.swing.JLabel l_county;
    private javax.swing.JLabel l_dateBirth;
    private javax.swing.JLabel l_email;
    private javax.swing.JLabel l_error;
    private javax.swing.JLabel l_indication;
    private javax.swing.JLabel l_indication1;
    private javax.swing.JLabel l_indication2;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_nickname;
    private javax.swing.JLabel l_password;
    private javax.swing.JLabel l_password1;
    private javax.swing.JLabel l_street;
    private javax.swing.JLabel l_subscribe;
    private javax.swing.JLabel l_surname;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel l_tnumber;
    private javax.swing.JTextField t_city;
    private javax.swing.JTextField t_county;
    private javax.swing.JTextField t_dateBirth;
    private javax.swing.JTextField t_email;
    private javax.swing.JTextField t_name;
    private javax.swing.JTextField t_nickname;
    private javax.swing.JTextField t_street;
    private javax.swing.JTextField t_surname;
    private javax.swing.JTextField t_tnumber;
    // End of variables declaration//GEN-END:variables
}
