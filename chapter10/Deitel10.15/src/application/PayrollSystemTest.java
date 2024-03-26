package application;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.HourlyEmployee;
import entities.Invoice;
import entities.PieceWorker;
import entities.SalariedEmployee;
import entities.interfaces.Payable;
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
		Invoice invoice1 = new Invoice("01234", "seat", 2, 375.00);
		Invoice invoice2 = new Invoice("56789", "tire", 4, 79.95);

		System.out.println("Employees and invoices processed individually:");

		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
				basePlusCommissionEmployee.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", invoice1, "invoice 1", invoice1.getPaymentAmount());
		System.out.printf("%s%n%s: $%,.2f%n%n", invoice2, "invoice 2", invoice2.getPaymentAmount());

		Payable[] employeesAndInvoces = new Payable[7];

		employeesAndInvoces[0] = salariedEmployee;
		employeesAndInvoces[1] = hourlyEmployee;
		employeesAndInvoces[2] = commissionEmployee;
		employeesAndInvoces[3] = basePlusCommissionEmployee;
		employeesAndInvoces[4] = pieceWorker;
		employeesAndInvoces[5] = invoice1;
		employeesAndInvoces[6] = invoice2;

		System.out.printf("Employees and invoices processed polymorphically:%n%n");

		for (Payable currentEmployeeOrInvoice : employeesAndInvoces) {
			System.out.println(currentEmployeeOrInvoice);

			if (currentEmployeeOrInvoice instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployeeOrInvoice;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}
			System.out.println();

		}

		for (int j = 0; j < employeesAndInvoces.length; j++)
			System.out.printf("Employee %d is a %s%n", j, employeesAndInvoces[j].getClass().getName());

	}
}
