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
public class WarningLog implements Runnable { // 5sec  - timestamp: [dd/MM/yyyy hh:mm:ss] – WARNING 

    private LogSystem ls;

    public WarningLog(LogSystem ls) {
        this.ls = ls;
    }

    @Override
    public synchronized void run() {
        while(true){
        Calendar cal = Calendar.getInstance();
        Date data = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //System.out.println("timestamp: [" + sdf.format(data) + "] - WARNING");
        ls.saveLog("timestamp: [" + sdf.format(data) + "] - WARNING");
        try {
            this.wait(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WarningLog.class.getName()).log(Level.SEVERE, null, ex);
        }}
    }
}
