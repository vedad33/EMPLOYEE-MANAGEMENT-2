/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatakhibernate;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author wedad
 */
public class ZadatakHibernate {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
          try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } catch(Exception e){
              JOptionPane.showMessageDialog(null, e.getMessage());
        }
      Glavni g = new Glavni();
      g.setVisible(true);
        
       
        
    }
}

