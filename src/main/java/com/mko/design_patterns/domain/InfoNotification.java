package com.mko.design_patterns.domain;

import com.mko.design_patterns.singleton.NotificationManager;
import com.mko.design_patterns.strategy.NotificationStrategy;

public class InfoNotification extends Notification {
	
	public InfoNotification(String message, NotificationStrategy strategy) {
		super(message, strategy);
	}

	@Override
	public void send() {
		String formatedMessage = getStrategy().formatMessage("[INFO] " +getMessage());
		NotificationManager.getInstance().notify(formatedMessage, NotificationType.INFO);
	}
}
