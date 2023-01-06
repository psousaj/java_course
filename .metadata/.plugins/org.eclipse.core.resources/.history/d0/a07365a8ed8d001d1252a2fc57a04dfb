package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
//		for (int i = 0; i<rooms.length; i++) {
////			if (rooms[i] != null) System.out.printf("%s%n", rooms[i]);
////		}
		
		List<Room> al = new ArrayList<Room>(Arrays.asList(rooms)); //Converte para List
//		al.forEach(Room::toStringNonNull); //Imprime usando referencia ao método da classe.
		                                    //esse método toStringNonNull verifica se objeto Room é null e imprime
		
		List<Room> nonNull = al.stream()
							.filter(x -> x != null)
							.collect(Collectors.toList()); // gera nova lista usando filter apenas com os objetos Room Não nulos
		
		nonNull.forEach(System.out::println); //imprime fazendo foreach com referencia ao método println de printStream

//		for (Room x : nonNull) {
//			System.out.println(x); // faz a mesma coisa usando mais linha
//		}
		
		sc.close();
		//comment
		//New comment	
	}

	
}
