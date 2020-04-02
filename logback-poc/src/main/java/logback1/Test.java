package logback1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Test {

	final static Logger logger = LoggerFactory.getLogger(Test.class);

	  public static void main(String[] args) {
		  
	    logger.info("Entering application.");
	    MDC.put("UUID", "*POC*");
	    logger.info("Exiting application.");
	    
	    ExecutorService pool = Executors.newFixedThreadPool(1);
	    Job job = new Job();
	    for(int i=0; i<10; i++) {
	    	pool.submit(job);
	    }
	    pool.shutdown();
	    
	    
	    ExecutorService pool1 = Executors.newFixedThreadPool(2);
	    for(int i=0; i<10; i++) {
	    	pool1.submit(job);
	    }
	    pool1.shutdown();
	  }

}
