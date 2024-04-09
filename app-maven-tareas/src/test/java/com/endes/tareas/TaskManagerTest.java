package com.endes.tareas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class TaskManagerTest {

	private TaskManager manager;
	
	@BeforeEach
	void setUp() {
		manager = new TaskManager();
	}
	
	@Test
	void testAddTask() {
		String taskTitle = "Complete the report";
		assertFalse(manager.taskExists(taskTitle), "La tarea no debería existir antes de ser añadida.");
		manager.addTask(taskTitle);
		assertTrue(manager.taskExists(taskTitle), "La tarea	debería existir después de ser añadida.");
	}
	
	@Test
	void testTaskCompletion() {
		String taskTitle = "Call Mike";
		manager.addTask(taskTitle);
		assertFalse(manager.isTaskCompleted(taskTitle), "La tarea no debería estar completada inmediatamente después de ser añadida.");
		manager.completeTask(taskTitle);
		assertTrue(manager.isTaskCompleted(taskTitle), "La tarea debería estar completada después de llamar a completeTask.");
	}
	
	@Test
	void testNonexistentTaskCompletion() {
		String taskTitle = "This task does not exist";
		assertFalse(manager.completeTask(taskTitle), "Intentar completar una tarea inexistente debería devolver false.");
	}
	
	@Test
	void testAddDuplicateTask() {
		String taskTitle = "Task already exists";
		assertTrue(manager.addTask(taskTitle), "Añadir una nueva tarea debería devolver true.");
		assertFalse(manager.addTask(taskTitle), "Intentar añadir una tarea duplicada debería devolver false.");
	}
}
