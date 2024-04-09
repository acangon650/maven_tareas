package com.endes.tareas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BooleanSupplier;

class TaskManager implements TaskManagerInterface {
	private HashMap<String, Task> tasks2=new HashMap<>();
	
	/**
	 * @param title>titulo de la task
	 * @author ACG
	 */
	@Override
	public boolean addTask(String title) {
		Task newTask = new Task(title);
		tasks2.put(title, newTask);
		System.out.println("\"" + title + "\" task has been added.");
		return true;
	}
	
	/**
	 * @param title>titulo de la task
	 * @author ACG
	 */
	@Override
	public boolean completeTask(String title) {
		tasks2.get(title).setCompleted(true);
		System.out.println("Task not found: " + title);
		return tasks2.get(title).isCompleted();
	}
	
	/**
	 * @author ACG
	 */
	@Override
	public void printTasks() {
		System.out.println("Tasks list:");
		for (Task task : tasks) {
			
		}
		
		
		for (String key : tasks2.keySet()) {
			System.out.print(tasks2.get(key).toString());
		}
		
		
		tasks2.entrySet()
		
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
		if(tasks2.get(taskTitle) != null) {
			return true;
		}
			
		/*
		for (Task task : tasks) {
			if (task.getTitle().equals(taskTitle)) {
				exists=true;
			}
		}*/
		
		
		
		
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
