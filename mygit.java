package NewJava;

import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {

		// scanner classes for integer values

	Scanner intvalue = new Scanner(System.in);
	System.out.println("Enter number");
	int num = intvalue.nextInt();

		for (int i = 20; i <= 100; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(i);
			}
		}

	}
}
