package application;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;
import entities.HourlyEmployees;
import entities.PieceWorkes;
import entities.SalariedEmployee;

public class Program {

	public static void main(String[] args) {

		Employee employee = new Employee("Douglas", "Cortez", "111111111");
		CommissionEmployee commissionEmployee = new CommissionEmployee("Douglas", "Cortez", "1111111", 4200, 0.2);
		BasePlusCommissionEmployee basePlusCommisionEmployee = new BasePlusCommissionEmployee("Douglas", "Cortez",
				"1111111", 4200, 0.2, 1000);
		SalariedEmployee salariedEmployee = new SalariedEmployee("Douglas", "Cortez", "111111111", 1000.0);
		PieceWorkes pieceWorkes = new PieceWorkes("Douglas", "Cortez", "11111111111", 20);
		HourlyEmployees hourlyEmployee = new HourlyEmployees("Douglas", "Cortez", "1111111", 40, 2);

		System.out.println(employee);
		System.out.println();
		System.out.println(commissionEmployee);
		System.out.println();
		System.out.println(basePlusCommisionEmployee);
		System.out.println();
		System.out.println(salariedEmployee);
		System.out.println();
		System.out.println(pieceWorkes);
		System.out.println();
		System.out.println(hourlyEmployee);
	}

}
