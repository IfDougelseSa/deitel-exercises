package application;

import entities.BasePlusCommissionEmployee;
import entities.CommissionEmployee;

public class Program {

	public static void main(String[] args) {
		CommissionEmployee commission = new CommissionEmployee("Douglas", "Cortez", "12345678", 50, 0.5);
		BasePlusCommissionEmployee baseCommissionEmployee = new BasePlusCommissionEmployee(commission, 100);
		
		System.out.println(baseCommissionEmployee);

	}

}
