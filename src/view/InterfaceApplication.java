/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private JPanel tryPanel;

    @Override
    public void run() {
        workingManager = new JFrame("Free Your Mind");
        workingManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        workingManager.setResizable(false);

        homePanel = new Home();
       try {
           tryPanel = new Try();
       } catch (SQLException ex) {
           Logger.getLogger(InterfaceApplication.class.getName()).log(Level.SEVERE, null, ex);
       }

      //  workingManager.add(homePanel, BorderLayout.CENTER);
       workingManager.getContentPane().add(tryPanel,BorderLayout.CENTER);
        workingManager.pack();
        workingManager.setLocationRelativeTo(null);
        workingManager.setVisible(true);
        workingManager.setPreferredSize(new Dimension(700,700));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new InterfaceApplication());
    }
    
}
