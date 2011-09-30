/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doscom.app.teawelcome;

import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.doscom.app.teawelcome.ui.uiLayout;

/**
 *
 * @author home
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        }catch(UnsupportedLookAndFeelException e){
            System.out.println(e.getMessage());
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                uiLayout l=new uiLayout();
                l.setExtendedState(JFrame.MAXIMIZED_BOTH);
                l.setVisible(true);
            }
        });
    }

}
