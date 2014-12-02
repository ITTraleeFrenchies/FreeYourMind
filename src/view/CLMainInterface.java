/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import view.Panel.Subscribe;
import view.Panel.Home;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CLMainInterface extends JFrame {

 //   private int currentCard = 1;
    private JPanel container;
    private final Home cardHome;
    private CardLayout cl;
    private final Subscribe cardSubscribe;

    public CLMainInterface() {
        container = new JPanel();
        cardHome = new Home();
        cardSubscribe = new Subscribe();
        cl = new CardLayout();

        container.setLayout(cl);
        container.add(cardHome, "home");
        container.add(cardSubscribe, "subscribe");

        cardHome.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if(cardHome.canConnect){
                     cl.next(container);
                }
               
            }
        });

        cardSubscribe.b_backHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                cl.first(container);
            }
        });

        /*
         nextBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
         if (currentCard < 4) {
         currentCard += 1;
         cl.show(cardPanel, "" + (currentCard));
         }
         }
         });
        */
        getContentPane().add(container, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
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
