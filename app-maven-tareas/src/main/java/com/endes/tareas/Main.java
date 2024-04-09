package com.endes.tareas;

public class Main {
	public static void main(String[] args) {
		TaskManager manager = new TaskManager();
		manager.addTask("Complete the report");
		manager.addTask("Call Mike");
		manager.completeTask("Call Mike");
		manager.printTasks();
	}
}