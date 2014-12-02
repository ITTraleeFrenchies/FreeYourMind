/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Others;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author t00178747
 */
public class InterfaceApplication implements Runnable {

    private JFrame workingManager;

  //  private JPanel homePanel;
   // private JPanel subscribe;
  //  private JPanel tryPanel;

    @Override
    public void run() {
        workingManager = new JFrame("Free Your Mind");
        workingManager.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        workingManager.setResizable(false);

      //  homePanel = new Home();
       // subscribe = new Subscribe();

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
        
       // workingManager.getContentPane().add(homePanel, BorderLayout.CENTER);
        
        /*
        ========== MANAGE SEVERAL PANELS ==============
        */
        //Create and set up the content pane.
        CardLayoutDemo demo = new CardLayoutDemo();
        demo.addComponentToPane(workingManager.getContentPane());
        
        // ================== AT THE END ===============
       // workingManager.getContentPane().add(homePanel, BorderLayout.CENTER);
        workingManager.pack();
        workingManager.setLocationRelativeTo(null);
        workingManager.setVisible(true);
        workingManager.setPreferredSize(new Dimension(700, 700));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new InterfaceApplication());
    }

    public JFrame getWorkingManager() {
        return workingManager;
    }
    
    

}
