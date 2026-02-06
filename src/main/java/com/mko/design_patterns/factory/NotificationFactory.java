package com.mko.design_patterns.factory;

import com.mko.design_patterns.domain.Notification;
import com.mko.design_patterns.domain.NotificationType;
import com.mko.design_patterns.domain.UrgentNotification;
import com.mko.design_patterns.strategy.HTMLNotificationStrategy;
import com.mko.design_patterns.strategy.JSONNotificationStrategy;
import com.mko.design_patterns.strategy.PlainTextNotificationStrategy;

public class NotificationFactory {

	public static Notification createNotification(String message, NotificationType type) {
		return switch (type) {
			case URGENT -> new UrgentNotification(message, new JSONNotificationStrategy());
			case INFO -> new UrgentNotification(message, new PlainTextNotificationStrategy());
			case MARKETING -> new UrgentNotification(message, new HTMLNotificationStrategy());
		};
	}
}
