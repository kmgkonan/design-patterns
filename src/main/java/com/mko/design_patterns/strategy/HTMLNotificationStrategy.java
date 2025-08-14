package com.mko.design_patterns.strategy;

public class HTMLNotificationStrategy implements NotificationStrategy {

	@Override
	public String formatMessage(String message) {
		return "<html><body></h1>" + message + "<h1></body></html>";
	}
}
