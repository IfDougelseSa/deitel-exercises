package application;

import java.time.LocalDate;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;
import entities.HourlyEmployee;
import entities.PieceWorker;
import entities.SalariedEmployee;
import tests.Date;

public class PayrollSystemTest {
	public static void main(String[] args) {

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00,
				new Date(5, 3, 1991));
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40,
				new Date(3, 3, 1995));
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06,
				new Date(3, 3, 1995));
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"444-44-4444", 5000, .04, 300, new Date(3, 3, 1995));
		PieceWorker pieceWorker = new PieceWorker("Douglas", "Cortez", "444-44-44444", new Date(10, 7, 1995), 100, 20);

		System.out.println("Employees processed individually:");

		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
				basePlusCommissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned",
				pieceWorker.earnings());

		Employee[] employees = new Employee[5];

		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;
		employees[4] = pieceWorker;

		System.out.printf("Employees processed polymorphically:%n%n");

		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}

			if (currentEmployee.getBirthDate().getMonth() == LocalDate.now().getMonthValue()) {
				System.out.printf("happy birthday!! you earned $100!! $%,.2f%n%n", (currentEmployee.earnings() + 100));
			} else {
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
			}

		}

		for (int j = 0; j < employees.length; j++)
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());

	}
}
