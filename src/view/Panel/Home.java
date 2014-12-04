/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import entities.Administrator;
import entities.Member;
import entities_DAO.AdministratorDAO;
import entities_DAO.MemberDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author t00178747
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form Home
     */
    private JPanel subscribe;
    public boolean canConnectAdmin = true;
    public boolean canConnectMember = false;
    public MemberDAO memberDAO;
    public Member memberConnected;
    public AdministratorDAO adminDAO;
    public Administrator adminConnected;

    public Home() {
        initComponents();
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(Color.LIGHT_GRAY);
        
        memberDAO = new MemberDAO();
        memberConnected = new Member();
        
        adminDAO = new AdministratorDAO();
        adminConnected = new Administrator();
        
        this.l_errorTnumber.setVisible(false);
        this.l_errorPassword.setVisible(false);
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
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
        l_tnumber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b_login = new javax.swing.JButton();
        t_tnumber = new javax.swing.JTextField();
        l_noAccount = new javax.swing.JLabel();
        l_forgot = new javax.swing.JLabel();
        b_subscribe = new javax.swing.JButton();
        b_retrieve = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        l_error = new javax.swing.JLabel();
        p_password = new javax.swing.JPasswordField();
        l_errorTnumber = new javax.swing.JLabel();
        l_errorPassword = new javax.swing.JLabel();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_tnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        l_tnumber.setText("Login (T-Number): ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Password: ");

        b_login.setText("Log in");
        b_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_loginActionPerformed(evt);
            }
        });

        l_noAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_noAccount.setText("No account yet ?");

        l_forgot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        l_forgot.setText("Forgot password ?");

        b_subscribe.setText("Susbscribe");
        b_subscribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_subscribeActionPerformed(evt);
            }
        });

        b_retrieve.setText("Retrieve");
        b_retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_retrieveActionPerformed(evt);
            }
        });

        l_errorTnumber.setForeground(new java.awt.Color(204, 0, 0));
        l_errorTnumber.setText("Error: enter a valid tnumber");
        l_errorTnumber.setOpaque(true);

        l_errorPassword.setForeground(new java.awt.Color(204, 0, 0));
        l_errorPassword.setText("Error: enter a valid password");
        l_errorPassword.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l_error, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_login)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(l_title)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_noAccount)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b_subscribe))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_forgot)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(b_retrieve)))
                            .addGap(350, 350, 350))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(l_tnumber)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(l_errorTnumber))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(p_password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(l_errorPassword)))
                            .addGap(182, 182, 182)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_tnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_errorTnumber)
                    .addComponent(l_tnumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(p_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_errorPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_noAccount)
                    .addComponent(b_subscribe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_forgot)
                    .addComponent(b_retrieve))
                .addGap(18, 18, 18)
                .addComponent(b_login)
                .addGap(11, 11, 11)
                .addComponent(l_error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_subscribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_subscribeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_subscribeActionPerformed

    private void b_retrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retrieveActionPerformed
        b_retrieve.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String email = JOptionPane.showInputDialog(b_retrieve, "Enter your email : ");
                // System.out.println(email);
            }
        });
    }//GEN-LAST:event_b_retrieveActionPerformed

    private void b_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_loginActionPerformed
        String tnumber = "";
        String password = "";

        tnumber = this.t_tnumber.getText();
        password = this.p_password.getText();

        MemberDAO memberDAO = new MemberDAO();
        AdministratorDAO adminDAO = new AdministratorDAO();

        if (!tnumber.equalsIgnoreCase("")) {
            /* //==========================
                if the user is an administrator
            */ //==========================
            if (tnumber.equalsIgnoreCase(adminDAO.tnumber_Aurelien)
                    || tnumber.equalsIgnoreCase(adminDAO.tnumber_Angele)
                    || tnumber.equalsIgnoreCase(adminDAO.tnumber_Mickael)
                    || tnumber.equalsIgnoreCase(adminDAO.tnumber_Quentin)) {
                Administrator admin = adminDAO.findByTnumber(tnumber);
                if (admin != null) {
                    if (password.equalsIgnoreCase(admin.getPassword())) {
                        canConnectAdmin = true;
                        adminConnected = admin;
                    }
                }
            } 
             /* //==========================
                if the user is a member
            */ //===========================
            else {
                Member member = memberDAO.findByTnumber(tnumber);
                if (member != null) {
                    if (password.equalsIgnoreCase(member.getPassword())) {
                        canConnectMember = true;
                        memberConnected = member;
                    }
                }
            }
              // canConnectMember = true;
              canConnectAdmin = true;
        }

        //System.out.println(tnumber + " -  " + password);
    }//GEN-LAST:event_b_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_login;
    private javax.swing.JButton b_retrieve;
    public javax.swing.JButton b_subscribe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l_error;
    public javax.swing.JLabel l_errorPassword;
    public javax.swing.JLabel l_errorTnumber;
    private javax.swing.JLabel l_forgot;
    private javax.swing.JLabel l_noAccount;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel l_tnumber;
    private javax.swing.JPasswordField p_password;
    private javax.swing.JTextField t_tnumber;
    // End of variables declaration//GEN-END:variables
}
