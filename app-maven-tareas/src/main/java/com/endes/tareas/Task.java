package com.endes.tareas;

public class Task {
	
	private String title;
	private boolean isCompleted;
	
	public Task(String title) {
		this.title = title;
		this.isCompleted = false;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	/**
	 * 
	 * @param isCompleted 
	 */
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}	
	
	@Override
	public String toString() {
		
	}
}
