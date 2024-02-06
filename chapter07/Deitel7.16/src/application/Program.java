package application;

public class Program {

	public static void main(String[] args) {

		double[] array = new double[args.length];
		double sum = 0;

		for (int i = 0; i < args.length; i++) {
			array[i] = Double.parseDouble(args[i]);
		}

		for (double i : array) {
			sum += i;
		}

		System.out.println(sum);

	}

}
