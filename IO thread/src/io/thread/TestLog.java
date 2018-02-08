package io.thread;

public class TestLog {
	
	public static void main(String [] args) {
		LogSystem s = new LogSystem();
		WarningLog w = new WarningLog(s);
		ErrorLog e = new ErrorLog(s);
		LogPrinter p = new LogPrinter(s);
		
		Thread tw = new Thread(w);
		tw.start();
		Thread te = new Thread(e);
		te.start();
		Thread tp = new Thread(p);
		tp.start();
	}
}
