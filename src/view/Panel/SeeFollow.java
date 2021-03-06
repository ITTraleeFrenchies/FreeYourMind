/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Panel;

import entities.Follow;
import entities.Member;
import entities_DAO.FollowDAO;
import entities_DAO.MemberDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

/**
 *
 * @author t00178730
 */
public class SeeFollow extends javax.swing.JPanel {

    /**
     * Creates new form SeeFollow
     */
    MemberDAO memberDAO = new MemberDAO();
    Member member = new Member();
    FollowDAO followDAO = new FollowDAO();
    Follow follow = new Follow();

    public SeeFollow() {
        initComponents();
        this.setPreferredSize(new Dimension(700,700));
        this.setBackground(Color.LIGHT_GRAY);
    }

    public void setTnumber(String tnumber) {
        tnumber = tnumber;
        member = memberDAO.findByTnumber(tnumber);
        follow = followDAO.find(tnumber);
        
        l_tnumber1.setText(tnumber);
        l_username.setText(member.getNickname());
        l_nbfollow.setText(String.valueOf(followDAO.count(tnumber)));
        
        List<Follow> allFollow= null;
        if(followDAO.findAll() != null){
            allFollow = followDAO.findAll();
        }
        
        String[] listFollow = new String[allFollow.size()];

        int i = 0;
        for (Follow follow : allFollow) {
            listFollow[i] = follow.getNicknameFollowed();
            i++;
        }
        jl_nickname.setListData(listFollow);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_follow = new javax.swing.JLabel();
        l_tnumber1 = new javax.swing.JLabel();
        l_title = new javax.swing.JLabel();
        l_nbfollow = new javax.swing.JLabel();
        b_back = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        b_seeProfile = new javax.swing.JButton();
        l_news = new javax.swing.JLabel();
        l_username = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_nickname = new javax.swing.JList();

        setPreferredSize(new java.awt.Dimension(700, 700));

        l_follow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_follow.setText("Number of people I follow :");

        l_tnumber1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_tnumber1.setText("T00000000");

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        l_nbfollow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_nbfollow.setText("0");

        b_back.setText("Back Home");
        b_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_backActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        b_seeProfile.setText("See profile");
        b_seeProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_seeProfileActionPerformed(evt);
            }
        });

        l_news.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_news.setText("People I follow");

        l_username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l_username.setText("User Name");

        jl_nickname.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jl_nickname);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(l_tnumber1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_username)
                            .addComponent(b_back))
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_news))
                .addContainerGap(358, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_title)
                .addGap(147, 147, 147))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_seeProfile)
                        .addGap(67, 67, 67)
                        .addComponent(l_follow)
                        .addGap(18, 18, 18)
                        .addComponent(l_nbfollow)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title)
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(l_tnumber1)
                            .addGap(18, 18, 18)
                            .addComponent(l_username)
                            .addGap(18, 18, 18)
                            .addComponent(b_back)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_news)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_follow)
                    .addComponent(l_nbfollow)
                    .addComponent(b_seeProfile))
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void b_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_backActionPerformed

    private void b_seeProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_seeProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_seeProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton b_back;
    public javax.swing.JButton b_seeProfile;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList jl_nickname;
    private javax.swing.JLabel l_follow;
    public javax.swing.JLabel l_nbfollow;
    private javax.swing.JLabel l_news;
    private javax.swing.JLabel l_title;
    public javax.swing.JLabel l_tnumber1;
    public javax.swing.JLabel l_username;
    // End of variables declaration//GEN-END:variables
}
