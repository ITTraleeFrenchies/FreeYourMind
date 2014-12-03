/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import view.Panel.Home;
import view.Panel.Subscribe;
import view.Panel.Terms;
import view.Panel.UserConnected;

public class CLMainInterface extends JFrame {

    private CardLayout cl;
    private JPanel container;
    
    // ========= ALL PANELS
    private final Home cardHome;
    private final Subscribe cardSubscribe;
    private final Terms terms;
    private final UserConnected userConnected;

    public CLMainInterface() throws IOException {
        container = new JPanel();
        cardHome = new Home();
        cardSubscribe = new Subscribe();
        terms = new Terms();
        userConnected = new UserConnected();
        cl = new CardLayout();

        container.setLayout(cl);
        container.add(cardHome, "home");
        container.add(cardSubscribe, "subscribe");
        container.add(terms, "terms");
        container.add(userConnected, "terms");

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
                  //   cl.next(container);
               
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
        terms.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(terms.canSubscribe){
                    cl.next(container);
                }
             }
        });
        terms.b_previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                    cl.show(container, "subscribe");
             }
        });
         // =============== PANEL USER CONNECTED ==================
       
         
        getContentPane().add(container, BorderLayout.CENTER);
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
