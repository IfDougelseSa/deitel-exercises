package application;

import entities.Employee;
import entities.PieceWorker;

public class Program {

	public static void main(String[] args) {
	
		Employee employee =  new Employee("Douglas", "Cortez", "111111111");
		System.out.println(employee);
		System.out.println();
		System.out.println(new PieceWorker("Diogo", "Cortez", "22222222", "Developer"));

	}

}
