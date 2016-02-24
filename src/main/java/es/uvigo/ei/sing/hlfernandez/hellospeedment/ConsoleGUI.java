package es.uvigo.ei.sing.hlfernandez.hellospeedment;

import java.util.Scanner;

import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;

import es.uvigo.ei.sing.hlfernandez.hellospeedment.db0.hellospeedment.user.User;

public class ConsoleGUI {
	private static final Scanner SCN = new Scanner(System.in);
	private Speedment speedment;
	private UsersController usersController;
	
	public ConsoleGUI(String dbpass) {
		this.speedment = new HellospeedmentApplication()
			.withPassword(dbpass)
			.build();
		this.usersController = new UsersController(this.speedment);
	}

	public void start() {
		String option;
		while (!(option = menu()).toUpperCase().equals("E")) {
			if (option.toUpperCase().equals("A")) {
				readUserAndPersistIt();
			} else if (option.toUpperCase().equals("L")) {
				listUsers();
			} else {
				System.out.println("Unknown option");
			}
		}
	}

	private static String menu() {
		printMenu();
		return SCN.nextLine();
	}

	private static void printMenu() {
		System.out.println("Options:");
		System.out.println("\t[E]xit.");
		System.out.println("\t[A]dd user.");
		System.out.println("\t[L]ist users.");
	}

	private void listUsers() {
		this.usersController.getUsers().forEach(System.out::println);
	}

	private void readUserAndPersistIt() {
		System.out.print("What is your name? ");
		final String name = SCN.nextLine();

		System.out.print("What is your age? ");
		final int age = SCN.nextInt();

		try {
			User user = this.usersController.addUser(name, age);
			System.out.println(user.getName() + " has been added.");
		} catch (SpeedmentException se) {
			System.out.println("An SpeedmentException occurred: " + 
				se.getMessage());
		}
		
		if (SCN.hasNextLine()) {
			SCN.nextLine();
		}
	}
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Database password required.");
			return;
		}
		new ConsoleGUI(args[0]).start();
	}
}
