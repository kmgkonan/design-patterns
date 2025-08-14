package com.mko.design_patterns.strategy;

public class PlainTextNotificationStrategy implements NotificationStrategy {

	//@Override
	public String formatMessage(String message) {
		return message;
	}

}
