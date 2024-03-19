package application;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Employee employee = new Employee("Douglas", "Cortez", "111111111");
		CommissionEmployee commissionEmployee = new CommissionEmployee("Douglas", "Cortez", "1111111", 4200, 0.2);
		BasePlusCommissionEmployee basePlusCommisionEmployee = new BasePlusCommissionEmployee("Douglas", "Cortez",
				"1111111", 4200, 0.2, 1000);

		System.out.println(employee);
		System.out.println();
		System.out.println(commissionEmployee);
		System.out.println();
		System.out.println(basePlusCommisionEmployee);
	}

}
