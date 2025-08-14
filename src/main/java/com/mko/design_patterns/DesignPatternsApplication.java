package com.mko.design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mko.design_patterns.domain.Notification;
import com.mko.design_patterns.domain.NotificationType;
import com.mko.design_patterns.factory.NotificationFactory;
import com.mko.design_patterns.oberver.EmailNotificationObserver;
import com.mko.design_patterns.oberver.PushNotificationObserver;
import com.mko.design_patterns.oberver.SMSNotificationOberser;
import com.mko.design_patterns.singleton.NotificationManager;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		NotificationManager manager = NotificationManager.getInstance();
		manager.addObserver(new EmailNotificationObserver());
		manager.addObserver(new PushNotificationObserver());
		manager.addObserver(new SMSNotificationOberser());
		
		Notification urgentNotification = NotificationFactory.createNotification("System failure", NotificationType.URGENT);
		Notification pushNotification = NotificationFactory.createNotification("Daily backup completed successfully", NotificationType.INFO);
		Notification marketingNotification = NotificationFactory.createNotification("New feature available", NotificationType.MARKETING);
		
		urgentNotification.send();
		System.out.println("*********************************************************");
		pushNotification.send();
		System.out.println("*********************************************************");
		marketingNotification.send();
		
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

}
