package com.mko.design_patterns.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
	
	private String message;

	public void send() {
		System.out.println(this.message);
	}
}
