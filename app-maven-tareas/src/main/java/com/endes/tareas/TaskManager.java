package com.endes.tareas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BooleanSupplier;

class TaskManager implements TaskManagerInterface {
	private List<Task> tasks = new ArrayList<>();
	
	/**
	 * @param title>titulo de la task
	 * @author ACG
	 */
	@Override
	public boolean addTask(String title) {
		Task newTask = new Task(title);
		tasks.add(newTask);
		System.out.println("\"" + title + "\" task has been added.");
		return true;
	}
	
	/**
	 * @param title>titulo de la task
	 * @author ACG
	 */
	@Override
	public boolean completeTask(String title) {
		boolean complete=false;
		for (Task task : tasks) {
			if (task.getTitle().equals(title)) {
				task.setCompleted(true);
				System.out.println("\"" + title + "\" task is now completed.");
				complete=true;
			}
		}
	System.out.println("Task not found: " + title);
	return complete;
	}
	
	/**
	 * @author ACG
	 */
	@Override
	public void printTasks() {
		System.out.println("Tasks list:");
		for (Task task : tasks) {
			System.out.println("- " + task.getTitle() + " [Status: " + (task.isCompleted() ? "Completed" : "Pending") + "]");
		}
	}

	/**
	 * @param taskTitle>titulo de la task
	 * @return devuelve si la tarea existe
	 * @author ACG
	 */
	public boolean taskExists(String taskTitle) {
		boolean exists=false;
		for (Task task : tasks) {
			if (task.getTitle().equals(taskTitle)) {
				exists=true;
			}
		}
		return exists;
	}

	/**
	 * @param taskTitle>titulo de la task
	 * @return devuelve si la tarea esta completa
	 * @author ACG
	 */
	public boolean isTaskCompleted(String taskTitle) {
		boolean completed=false;
		for (Task task : tasks) {
			if (task.getTitle().equals(taskTitle)) {
				if(task.isCompleted()==true) {
					completed=true;
				}
			}
		}
		return completed;
	}
}
