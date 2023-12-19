package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int count = 1;

		while (count <= 3) {

			System.out.print("Enter employee name: ");
			String name = sc.next();

			System.out.print("Enter employee hours: ");
			int hours = sc.nextInt();

			System.out.print("Enter employee salary: ");
			double salary = sc.nextDouble();

			Employee employee = new Employee(name, hours, salary);

			System.out.println();

			System.out.printf("Employee name: %s%nEmployee gross salary: %.2f%n", employee.getName(),
					employee.totalSalary());
			System.out.println();

			count++;

		}

		sc.close();

	}

}
