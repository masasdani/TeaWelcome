/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.doscom.app.teawelcome.appbuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author badak
 */
public class io {

    public void action(){
        try {
            //File file =new File("grub");
            BufferedWriter bw = new BufferedWriter(new FileWriter("action"));
            bw.write("#/bin/bash");bw.newLine();
            bw.write("cp grub /etc/default/grub");bw.newLine();
            bw.write("update-grub");bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void defaultGrub(){
        try {
            //File file =new File("grub");
            BufferedWriter bw = new BufferedWriter(new FileWriter("grub"));
            bw.write("# If you change this file, run 'update-grub' afterwards to update"
                    + "\n#/boot/grub/grub.cfg.\n\n"
                    + "GRUB_DEFAULT=0\n"
                    + "#GRUB_HIDDEN_TIMEOUT=0\n"
                    + "GRUB_HIDDEN_TIMEOUT_QUIET=true\n"
                    + "GRUB_TIMEOUT=10\n"
                    + "GRUB_DISTRIBUTOR=`lsb_release -i -s 2> /dev/null || echo Debian`\n"
                    + "GRUB_CMDLINE_LINUX_DEFAULT=\"quiet splash\"\n"
                    + "GRUB_CMDLINE_LINUX=\"\"");bw.newLine();
            
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
