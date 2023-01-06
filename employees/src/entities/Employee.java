package entities;

public class Employee {
	int ID;
	String name;
	double salary;
	
	public Employee(int iD, String name, double salary) {
		ID = iD;
		this.name = name;
		this.salary = salary;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(int percentage) {
		salary += salary*percentage/100;
	}
	
	public String toString() {
		return String.format("%s, %s, %.2f", ID, name, salary);
	}
}
