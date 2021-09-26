/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Archit Garg
 */
public class Cinit extends Thread{
    String server_ip = null; 
    Client dg;
    
    /*
    *starts the thread
    */
    public Cinit(String server_ip) {
        this.server_ip=server_ip;
        start();
        }
    
    /*
    *opens client chat window
    *receives messages from server and display it on client chat room
    */
    public void run(){
            try {
                dg=new Client(server_ip);
        dg.setVisible(true);
                 do{
                     
                String smessage=dg.dis.readUTF();
                dg.jTextArea1.append("server :- "+smessage+"\n\n");
                     
                     }while(true);
            } catch (IOException ex) {
                Logger.getLogger(Cinit.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
    }
}
