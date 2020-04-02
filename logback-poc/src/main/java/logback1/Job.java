package logback1;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Job implements Runnable {
	final static Logger logger = LoggerFactory.getLogger(Test.class);
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString();
		MDC.put("UUID", uuid);
		logger.debug("Job");

	}

}
