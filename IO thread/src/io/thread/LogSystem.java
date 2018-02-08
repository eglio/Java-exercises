/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author egliocz
 */
public class LogSystem {

    private PrintStream pw;
    private FileReader fr;
    private BufferedReader br;
    private FileInputStream FIS;

    public LogSystem() {
        try {
            this.FIS= new FileInputStream("log.txt");
            this.pw = new PrintStream("log.txt");
            this.fr = new FileReader("log.txt");
            this.br = new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            System.out.println("file non trovato");
        }
    }
    
    public synchronized void saveLog(String log) {
        //System.out.println("scrive file");
        pw.println(log);
    }

    ;
        
        public synchronized List readLog() throws IOException {
          //  System.out.println("legge file");
        ArrayList<String> l = new ArrayList<>();
        String tmp;
        do {
            tmp = br.readLine();
            if (tmp != null) l.add(tmp);    
        } while (tmp != null);
        
        return l;
    }
;
}
