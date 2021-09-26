/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Archit garg
 */
public class Sinit extends Thread{ 
    Server dg;
    
    /*
    *constructor
    *starts the thread
    */
    public Sinit() {
        start();
    }
    
    /*
    *open server chat window
    *receive messages from client
    *show client messages on server chat window
    */
    public void run(){
         try {
            dg=new Server();
        dg.setVisible(true);
         
             do{
                
               dg.cmessage=dg.dis.readUTF();
                dg.jTextArea1.append("client :- "+dg.cmessage+"\n\n");
                 
                 }while(true);
            } catch (IOException ex) {
                Logger.getLogger(Sinit.class.getName()).log(Level.SEVERE, null, ex);
            }
           
    }
    
}

