package main;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {

	ArrayList<Task> tasks = new ArrayList<>();

	final int QUIT = 5;
	final int ADD = 1;
	final int SEARCH = 2;
	final int DELETE = 3;
	final int STATUS = 4;

	private void run() {
		welcoming();
		Scanner scan = new Scanner(System.in);
		int choice = 0;

		while (choice != QUIT) {
			printTasks();

			printMenu();

			choice = scan.nextInt();

			if (choice == ADD) {
				System.out.println("Insert new task");

				String title = scan.next();
				title += scan.nextLine();
				Task task1 = new Task(title);
				tasks.add(task1);

			} else if (choice == 4) {
				if(tasks.size() > 0) {					
					System.out.println();
					System.out.println("choose the number of the task");
					int ch = scan.nextInt();
					Task t = tasks.get(ch);
					t.changeStatus();
				}
			}

		}
	}

	private void welcoming() {
		System.out.println();
		System.out.println("Welcome");
		System.out.println();
	}

	private void printTasks() {
		if (tasks.size() != 0) {
			for (int i = 0; i < tasks.size(); i++) {
				Task T = tasks.get(i);
				System.out.println(i + "- " + T.toString());
			}
		} else {
			System.out.println("No tasks available");
		}
	}

	private void printMenu() {
		System.out.println();

		System.out.println("Choose one of the options below:");
		System.out.println(" 1- Add new task");
		System.out.println(" 2- Search for a task");
		System.out.println(" 3- Delete a task");
		System.out.println(" 4- Change a task status");
		System.out.println(" 5- Quit");

		System.out.println();
		System.out.print("Your Choice: ");
	}

	public static void main(String[] args) {
		new TodoApp().run();
	}
}
