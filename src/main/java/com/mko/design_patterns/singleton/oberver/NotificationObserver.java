package com.mko.design_patterns.singleton.oberver;

import com.mko.design_patterns.domain.NotificationType;

public interface NotificationObserver {

	void update(String message, NotificationType type);
}
