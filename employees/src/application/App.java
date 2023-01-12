package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import entities.Employee;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList();
		
		System.out.println("How many employees will be registered? ");
		int quantityOfEmployees = sc.nextInt();
		
		for(int i = 0; i<quantityOfEmployees; i++) {
			System.out.printf("Employee #%s:", i+1);
			System.out.println("Id: ");
			int id = sc.nextInt();
			
			while(hasId(employees, id)){
				System.out.print("Id already taken! Try again:");
				id=sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		employees.forEach(System.out::println);
		System.out.println("------------------------");
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idEmployeeIncreaseSalary = sc.nextInt();
		
		System.out.println("Enter the percentage");
		int percentage = sc.nextInt();
		
		Consumer consumer = new Consumer<Employee>() {
			 @Override
			 public void accept(Employee x) {
				 x.increaseSalary(percentage);
			 }
		 };
		 
		employees.stream()
				 .filter(x->x.getID() == (idEmployeeIncreaseSalary))
				 .findFirst().ifPresentOrElse(consumer, new Runnable() {
					@Override
					public void run() {
						// TODO Auto-generated method stub
							System.out.println("This is an invalid employee Id! Try again");
					}
				});
				 
		
		/* implementação do professor nélio alves
		 Employee emp = employees.stream()
				.filter(x -> x.getID() == idEmployeeIncreaseSalary)
				.findFirst()
				.orElse(null);
		
		 if (emp == null) System.out.println("This ID does not exist");
		 else {
		 	System.out.println("Enter the percentage");
		 	int percentage = sc.nextInt();
			System.out.println("List of employees");
			employees.forEach(System.out::println);
			sc.close();
		}
		 */	
		
		System.out.println("List of employees");
		employees.forEach(System.out::println);
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getID() == id).findFirst().orElse(null);
		return emp != null;
	}
}
