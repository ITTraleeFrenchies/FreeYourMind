/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.Panel.AdministratorConnected;
import view.Panel.Home;
import view.Panel.Profile;
import view.Panel.Subscribe;
import view.Panel.Terms;
import view.Panel.UserConnected;

public class CLMainInterface extends JFrame {

    private CardLayout cl;
    private JPanel container;
    
    // ========= ALL PANELS
    private final Home cardHome;
    private final Subscribe cardSubscribe;
    private final Terms cardTerms;
    private final UserConnected cardUserConnected;
    private final Profile cardProfile;
    private final AdministratorConnected cardAdministratorConnected;
    
    public CLMainInterface() throws IOException {
        container = new JPanel();
        cardHome = new Home();
        cardSubscribe = new Subscribe();
        cardTerms = new Terms();
        cardUserConnected = new UserConnected();
        cardProfile = new Profile();
        cardAdministratorConnected = new AdministratorConnected();
        
        cl = new CardLayout();

        container.setLayout(cl);
        container.add(cardHome, "home");
        container.add(cardSubscribe, "subscribe");
        container.add(cardTerms, "terms");
        container.add(cardUserConnected, "userConnected");
        container.add(cardProfile, "profile");
        container.add(cardAdministratorConnected, "administratorConnected");
        
        // =============== PANEL HOME ==================
        cardHome.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                     cl.next(container);
               
            }
        });
         cardHome.b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(cardHome.canConnectAdmin){
                    cl.show(container, "administratorConnected");
                }
               
            }
        });
        
          // =============== PANEL SUBSCRIBE ==================
        cardSubscribe.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(cardSubscribe.canBeConnected){
                     cl.next(container);
                }
                    
               
            }
        });
        cardSubscribe.b_backHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.first(container);
            }
        });
        
        
          // =============== PANEL TERMS ==================
        cardTerms.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(cardTerms.canSubscribe){
                    cl.next(container);
                }
             }
        });
        cardTerms.b_previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                    cl.show(container, "subscribe");
             }
        });
         // =============== PANEL USER CONNECTED ==================
        getContentPane().add(container, BorderLayout.CENTER);
        cardUserConnected.b_disconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                cl.first(container);
            }
    });
         // =============== PANEL USER CONNECTED ==================
        getContentPane().add(container, BorderLayout.CENTER);
        cardUserConnected.b_seeprofile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cl.show(container, "profile");
            }
    });
        // =============== PANEL PROFILE ==================
        getContentPane().add(container, BorderLayout.CENTER);
        cardProfile.b_backHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cl.show(container, "userConnected");
            }
    });
        // =============== PANEL ADMINISTRATOR CONNECTED ==================
        getContentPane().add(container, BorderLayout.CENTER);
        cardAdministratorConnected.b_disconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cl.show(container, "home");
            }
    });
        cardAdministratorConnected.b_seemembers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Members");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });
        cardAdministratorConnected.b_seelibraries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Libraries");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });
        cardAdministratorConnected.b_seeplaylists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Playlists");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    }); 
        cardAdministratorConnected.b_seemusics.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Musics");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });  
        cardAdministratorConnected.b_seelikes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Likes");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });  
        cardAdministratorConnected.b_seerecommends.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Recommendations");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });
        cardAdministratorConnected.b_seefollowlists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Follow Lists");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });  
        cardAdministratorConnected.b_seeblocked.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
               cardAdministratorConnected.l_view.setText("Users blocked");
               cardAdministratorConnected.l_view.setVisible(true);
            }
    });  
        
        
    }

    public static void main(String[] args) throws IOException {
        CLMainInterface cl = new CLMainInterface();
        cl.setTitle("Free Your Mind");
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cl.setVisible(true);
        cl.setSize(700, 700);
        cl.setResizable(false);
        cl.setLocationRelativeTo(null);
     //   cl.setIconImage(new ImageIcon("src/Ressources/logo.PNG").getImage());

    }
}
