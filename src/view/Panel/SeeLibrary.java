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

/**
 *
 * @author t00178760
 */
public class SeeLibrary extends javax.swing.JPanel {

    /**
     * Creates new form SeeLibrary
     */
    MemberDAO memberDAO = new MemberDAO();
    Member member = new Member();
    String tnumber ="";
    
    public SeeLibrary() {
        initComponents();
        this.setPreferredSize(new Dimension(700, 700));
        this.setBackground(Color.LIGHT_GRAY);
    }
    
    public void setTnumber(String tnumberToGet){
             tnumber =tnumberToGet;
                System.out.println(tnumber);
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
        username = new javax.swing.JLabel();
        user_tnumber = new javax.swing.JLabel();
        libraryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPlaylistMusic = new javax.swing.JList();

        l_title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        l_title.setText("Free Your Mind");

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setText("User Name");

        user_tnumber.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        user_tnumber.setText("T00000000");

        libraryLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        libraryLabel.setText("Library");

        listPlaylistMusic.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "item1 item2 item3", "item4 item5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listPlaylistMusic);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(user_tnumber))
                    .addComponent(username))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_title)
                    .addComponent(libraryLabel))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_tnumber)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(libraryLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_title;
    private javax.swing.JLabel libraryLabel;
    private javax.swing.JList listPlaylistMusic;
    public javax.swing.JLabel user_tnumber;
    public javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
