/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author t00178747
 */
public class InterfaceApplication implements Runnable{

   private JFrame workingManager;

    private JPanel homePanel;

    @Override
    public void run() {
        workingManager = new JFrame("Hello");
        workingManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        homePanel = new Home();

        workingManager.add(homePanel, BorderLayout.CENTER);
        workingManager.pack();
        workingManager.setLocationByPlatform(true);
        workingManager.setVisible(true);
        workingManager.setPreferredSize(new Dimension(700,700));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new InterfaceApplication());
    }
    
}
