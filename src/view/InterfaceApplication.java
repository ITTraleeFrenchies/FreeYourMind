/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author t00178747
 */
public class InterfaceApplication implements Runnable {

    private JFrame workingManager;

    private JPanel homePanel;
    private JPanel tryPanel;

    @Override
    public void run() {
        workingManager = new JFrame("Free Your Mind");
        workingManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        workingManager.setResizable(false);

        homePanel = new Home();

         // =============== display a panel ==========
        /*  try {
         tryPanel = new Try();
         } catch (SQLException ex) {
         Logger.getLogger(InterfaceApplication.class.getName()).log(Level.SEVERE, null, ex);
         }
         */
        
        
        // =============== display an image ==========
       /* BufferedImage img = null;
        try {
            img = ImageIO.read(new File("src/Ressources/black_square.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);
        } catch (IOException ex) {
            Logger.getLogger(InterfaceApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon icon = new ImageIcon(img);
        JLabel label = new JLabel(icon);
        label.setBounds(100, 100, 500, 500);
        homePanel.add(label);
               */

        //  workingManager.add(homePanel, BorderLayout.CENTER);
        homePanel.setBackground(Color.LIGHT_GRAY);
        workingManager.getContentPane().add(homePanel, BorderLayout.CENTER);
        workingManager.pack();
        workingManager.setLocationRelativeTo(null);
        workingManager.setVisible(true);
        workingManager.setPreferredSize(new Dimension(700, 700));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new InterfaceApplication());
    }

}
