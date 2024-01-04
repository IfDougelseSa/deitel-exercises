package application;

import entities.AutoPolicy;

public class Program {

	public static void main(String[] args) {

		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");

		policy1.setState("tests");
		System.out.println(policy1.getState());

	}

}
