/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttcp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author egliocz 
 */
public class ClientTCP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
                try {
                    InetAddress lhost = InetAddress.getLocalHost();
                    Socket s = new Socket(lhost,120);
                    BufferedReader keyb = new BufferedReader(new InputStreamReader (System.in));
                    BufferedReader in = new BufferedReader (new InputStreamReader(s.getInputStream()));
                    PrintWriter out = new PrintWriter((new OutputStreamWriter(s.getOutputStream())));
                    System.out.println(s);
                    while (true){
                    String msg=keyb.readLine();
                    if(msg != null){
                        System.out.println("sending "+msg);
                        
                        out.println(msg);
                        
                        String resp;
                        do{resp = in.readLine();}
                        while (resp == null);
                        System.out.println("got: "+resp);
                        if (resp.equalsIgnoreCase("Quitting"))
                                {
                                s.close();
                                keyb.close();
                                in.close();
                                out.close();
                                System.exit(0);
                                }
                                
                    }
                    
                    
                    }
                } catch (UnknownHostException ex) {
            System.out.println("connection error");
                      
        } catch (IOException ex) {
            System.out.println("cannot connect");
        }
}
}
