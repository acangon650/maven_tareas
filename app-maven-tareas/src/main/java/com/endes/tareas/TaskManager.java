package com.endes.tareas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TaskManager implements TaskManagerInterface {
	private List<Task> tasks = new ArrayList<>();
	
	@Override
	public void addTask(String title) {
		Task newTask = new Task(title);
		tasks.add(newTask);
		System.out.println("\"" + title + "\" task has been added.");
	}
	
	@Override
	public void completeTask(String title) {
		for (Task task : tasks) {
			if (task.getTitle().equals(title)) {
				task.setCompleted(true);
				System.out.println("\"" + title + "\" task is now completed.");
				return;
			}
		}
	System.out.println("Task not found: " + title);
	}
	
	@Override
	public void printTasks() {
		System.out.println("Tasks list:");
		for (Task task : tasks) {
			System.out.println("- " + task.getTitle() + " [Status: " + (task.isCompleted() ? "Completed" : "Pending") + "]");
		}
	}
}
