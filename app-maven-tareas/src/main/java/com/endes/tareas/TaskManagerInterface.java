package com.endes.tareas;

public interface TaskManagerInterface {
	
	public boolean addTask(String title);
	
	public boolean completeTask(String title);
	
	public void printTasks();

}
