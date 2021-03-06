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
import view.Panel.SeeFollow;
import view.Panel.SeeFollowers;
import view.Panel.SeeLibrary;
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
    private final SeeLibrary cardLibrary;
    private final SeeFollow cardFollow;
    private final SeeFollowers cardFollowers;

    public CLMainInterface() throws IOException {
        this.setSize(700, 700);
        container = new JPanel();
        cardHome = new Home();
        cardSubscribe = new Subscribe();
        cardTerms = new Terms();
        cardUserConnected = new UserConnected();
        cardProfile = new Profile();
        cardAdministratorConnected = new AdministratorConnected();
        cardLibrary = new SeeLibrary();
        cardFollow = new SeeFollow();
        cardFollowers = new SeeFollowers();

        cl = new CardLayout();

        container.setLayout(cl);
        container.add(cardHome, "home");
        container.add(cardSubscribe, "subscribe");
        container.add(cardTerms, "terms");
        container.add(cardUserConnected, "userConnected");
        container.add(cardProfile, "profile");
        container.add(cardAdministratorConnected, "administratorConnected");
        container.add(cardLibrary, "library");
        container.add(cardFollow, "follow");
        container.add(cardFollowers, "followers");
        
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
                if (cardHome.canConnectAdmin) {
                    cardAdministratorConnected.setTnumberAdmin(cardHome.adminConnected.getTnumber());
                    cl.show(container, "administratorConnected");
                } else if (cardHome.canConnectMember) {
                    System.out.println(cardHome.memberConnected.getTnumber());
                    cardUserConnected.setTnumber(cardHome.memberConnected.getTnumber());
                    cl.show(container, "userConnected");
                }
            }
        });
        cardUserConnected.b_seeprofile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(container, "profile");
            }
        });

        // =============== PANEL SUBSCRIBE ==================
        cardSubscribe.b_subscribe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (cardSubscribe.canBeConnected) {
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
                if (cardTerms.canSubscribe) {
                    cl.show(container, "home");
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
        cardUserConnected.b_disconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardUserConnected.reinitUser();
                cardHome.setCanConnectMember(false);
                cl.first(container);
            }
        });

        cardUserConnected.b_seelibrary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(container, "library");
            }
        });
        cardUserConnected.b_seefollowlist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardFollow.setTnumber(cardHome.memberConnected.getTnumber());
                cl.show(container, "follow");
            }
        });
        cardUserConnected.b_seefollowerslist.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardFollowers.setTnumber(cardHome.memberConnected.getTnumber());
                cl.show(container, "followers");
            }
        });

        // =============== PANEL PROFILE ==================
        cardProfile.b_backHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(container, "userConnected");
            }
        });
        // =============== PANEL ADMINISTRATOR CONNECTED ==================
        cardAdministratorConnected.b_disconnect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardAdministratorConnected.reinitUser();
                cardHome.setCanConnectAdmin(false);
                cl.show(container, "home");
            }
        });

        // =============== PANEL SEE LIBRARY ==================
        cardHome.b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (cardHome.canConnectMember) {
                    cardLibrary.setTnumber(cardHome.memberConnected.getTnumber());
                }
            }
        });
        cardLibrary.b_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 cl.show(container, "userConnected");
            }
        });

        // =============== PANEL SEE PROFILE ==================
        cardHome.b_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (cardHome.canConnectMember) {
                    cardProfile.getTnumberConnected(cardHome.memberConnected.getTnumber());
                }
            }
        });
         // =============== PANEL SEE FOLLOW ==================
        cardFollow.b_back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                     cl.show(container, "userConnected");
            }
        });
         // =============== PANEL SEE FOLLOWERS ==================
        cardFollowers.b_backhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                     cl.show(container, "userConnected");
            }
        });

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
