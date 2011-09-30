/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doscom.app.teawelcome.template;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author home
 */
public class panelImage extends JPanel{

    Image image;
    public panelImage() {
        image=new ImageIcon(getClass().getResource("/org/doscom/app/teawelcome/resources/whitetea.png")).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D) g.create();
        gd.drawImage(image, 0,0, getWidth(),getHeight(), null);
        gd.dispose();
    }



}
