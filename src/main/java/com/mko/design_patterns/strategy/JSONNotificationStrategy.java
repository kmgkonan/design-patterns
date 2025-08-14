package com.mko.design_patterns.strategy;

public class JSONNotificationStrategy implements NotificationStrategy {

	@Override
	public String formatMessage(String message) {
		return "{\"message\":\"" + message + "\"}";
	}
}
