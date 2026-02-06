package com.mko.design_patterns.oberver;

import com.mko.design_patterns.domain.NotificationType;

public class SMSNotificationOberser implements NotificationObserver {

	@Override
	public void update(String message, NotificationType type) {
		System.out.println("Sending SMS: " +message);
	}

}
