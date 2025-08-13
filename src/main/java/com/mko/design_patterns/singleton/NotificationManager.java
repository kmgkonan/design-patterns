package com.mko.design_patterns.singleton;

public class NotificationManager {

	private static NotificationManager instance;
	
	private NotificationManager() {}
	
	public static NotificationManager getInstance() {
		if(instance == null) {
			instance = new NotificationManager();
		}
		return instance;
	}
}
