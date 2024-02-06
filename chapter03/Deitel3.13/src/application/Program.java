package application;

import application.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Douglas", "Cortez", 4200);
		Employee employee2 = new Employee("Diogo", "Cortez", 12200);

		System.out.printf("%s %s anual salary: %.2f%n", employee1.getFirstName(), employee1.getSecondName(),
				employee1.anualSalary());
		System.out.printf("%s %s anual salary: %.2f%n%n", employee2.getFirstName(), employee2.getSecondName(),
				employee2.anualSalary());

		employee1.increaseSalary(1.10);
		employee2.increaseSalary(1.10);

		System.out.println("10% salary increased: ");

		System.out.printf("%s %s anual salary: %.2f%n", employee1.getFirstName(), employee1.getSecondName(),
				employee1.anualSalary());
		System.out.printf("%s %s anual salary: %.2f%n", employee2.getFirstName(), employee2.getSecondName(),
				employee2.anualSalary());

	}

}
