package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room rooms [] = new Room [10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		String name, email;
		int room;
		
		for(int i = 0; i<n; i++) {
			System.out.printf("\nRent #%s: %n", i+1);
			sc.nextLine();
			System.out.println("Name: ");
			name = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Room: ");
			room = sc.nextInt();
			
			rooms[room] = new Room(name, email, room);
		}
		
		System.out.println("\nBusy Rooms:");
		for (int i = 0; i<rooms.length; i++) {
			if (rooms[i] != null) System.out.printf("%s: %s%n", i, rooms[i]);
		}
		sc.close();
		//comment
	}

}
