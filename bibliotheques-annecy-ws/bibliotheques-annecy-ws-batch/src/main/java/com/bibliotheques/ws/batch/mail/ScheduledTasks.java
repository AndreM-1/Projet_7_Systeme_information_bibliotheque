package com.bibliotheques.ws.batch.mail;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


//@Component
public class ScheduledTasks {
	
	//Définition du LOGGER
	private static final Logger LOGGER=(Logger) LogManager.getLogger(ScheduledTasks.class);
	
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	//@Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
		LOGGER.info("The time is now {}", dateFormat.format(new Date()));
    }
}