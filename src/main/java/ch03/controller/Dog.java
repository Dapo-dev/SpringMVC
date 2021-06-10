package ch03.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog {
String timeCreating; 
	
	public Dog() {
		Date date = new Date();
		timeCreating = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(date);
	}
	
	public String getTimeCreating() {
		return timeCreating;
	}

	public void setTimeCreating(String timeCreating) {
		this.timeCreating = timeCreating;
	}

	@Override
	public String toString() {
		return "Dog [createTime=" + timeCreating + "], hashCode=" + hashCode();
	} 
}
