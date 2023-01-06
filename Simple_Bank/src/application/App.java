package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		
		System.out.println("Enter account number: ");
		String number = sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there an inicial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response ==  'y')  {
			System.out.println("Enter initial deposit value");
			account = new Account(number, holder, sc.nextDouble());
		} else account = new Account(number, holder);
		
		System.out.println("\n"+account);
		
		System.out.println("\nEnter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.println("\nUpdated "+account);
		
		System.out.println("\nEnter a whitdraw value: ");
		account.withDraw(sc.nextDouble());
		System.out.println("\nUpdated "+account);
	}

}
