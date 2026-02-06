package com.mko.design_patterns.domain;

import com.mko.design_patterns.strategy.NotificationStrategy;

public abstract class Notification {
	
	private String message;
	private NotificationStrategy strategy;
	
	public Notification() {}
	
	public Notification(String message, NotificationStrategy strategy) {
		this.message = message;
		this.strategy = strategy;
	}

	public abstract void send();

	public NotificationStrategy getStrategy() {
		return strategy;
	}

	public String getMessage() {
		return message;
	}
}
