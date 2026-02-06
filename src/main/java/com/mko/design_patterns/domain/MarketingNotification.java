package com.mko.design_patterns.domain;

import com.mko.design_patterns.singleton.NotificationManager;
import com.mko.design_patterns.strategy.NotificationStrategy;

public class MarketingNotification extends Notification {
	
	public MarketingNotification(String message, NotificationStrategy strategy) {
		super(message, strategy);
	}

	@Override
	public void send() {
		String formatedMessage = getStrategy().formatMessage("[MARKETING] " +getMessage());
		NotificationManager.getInstance().notify(formatedMessage, NotificationType.MARKETING);
	}
}
