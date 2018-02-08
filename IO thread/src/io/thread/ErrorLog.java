/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package io.thread;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author egliocz
 */
public class ErrorLog implements Runnable { //10 sec - timestamp: [dd/MM/yyyy hh:mm:ss] – WARNING

    private LogSystem ls;

    public ErrorLog(LogSystem ls) {
        this.ls = ls;
    }

    @Override
    public synchronized void run() {
        while(true){
        Calendar cal = Calendar.getInstance();
        Date data = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //System.out.println("timestamp: [" + sdf.format(data) + "] - ERROR");
        ls.saveLog("timestamp: [" + sdf.format(data) + "] - ERROR");
        try {
            this.wait(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(io.thread.WarningLog.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
}
