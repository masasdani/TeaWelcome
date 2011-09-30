/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doscom.app.teawelcome.appbuilder;

import java.io.IOException;

/**
 *
 * @author badak
 */
public class runtime {

    public void bash(){
        try {
            ProcessBuilder pb=new ProcessBuilder("bash", "-c", "gksudo bash action");
            pb.start();
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }

    public void memtesOn(){
        try {
            ProcessBuilder builder=new ProcessBuilder("bash", "-c", "gksudo chmod 755 /etc/grub.d/20_memtest86+");
            builder.start();
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }

    public void memtesOff(){
        try {
            ProcessBuilder builder=new ProcessBuilder("bash", "-c", "gksudo chmod 444 /etc/grub.d/20_memtest86+");
            builder.start();
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }

    public void reboot(){
        try {
            ProcessBuilder builder=new ProcessBuilder("bash", "-c", "gksudo reboot");
            builder.start();
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }
}
