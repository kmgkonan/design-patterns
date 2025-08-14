package com.mko.design_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

import com.mko.design_patterns.domain.NotificationType;
import com.mko.design_patterns.oberver.NotificationObserver;

public class NotificationManager {

	private static NotificationManager instance;
	List<NotificationObserver> observers = new ArrayList<NotificationObserver>();
	
	private NotificationManager() {}
	
	public static NotificationManager getInstance() {
		if(instance == null) {
			instance = new NotificationManager();
		}
		return instance;
	}
	
	public void addObserver(NotificationObserver observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(NotificationObserver observer) {
		this.observers.remove(observer);
	}
	
	public void notify(String message, NotificationType type) {
		for(NotificationObserver observer : this.observers) {
			observer.update(message, type);
		}
	}
}
