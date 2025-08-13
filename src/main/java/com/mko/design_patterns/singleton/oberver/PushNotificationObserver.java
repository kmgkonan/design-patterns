package com.mko.design_patterns.singleton.oberver;

import com.mko.design_patterns.domain.NotificationType;

public class PushNotificationObserver implements NotificationObserver {

	@Override
	public void update(String message, NotificationType type) {
		System.out.println("Sending push notification: " +message);
	}

}
