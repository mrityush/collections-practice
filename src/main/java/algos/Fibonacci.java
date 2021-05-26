package algos;

import java.util.Scanner;

public class Fibonacci {
	int n = 5;

	public static void main(String[] args) {
		System.out.println("Enter num of fib numbers");
		Scanner sc = new Scanner(System.in); //System.in is a standard input stream.
		int a = sc.nextInt();
		printFibonacci(a, 1, 0, 0);

	}

	private static int printFibonacci(int index, int initialNumber1, int initialNumber2, int counter) {
		while (counter < index) {
			counter++;
			System.out.print(initialNumber1 + ", ");
			initialNumber1 += printFibonacci(index, initialNumber1, initialNumber2, counter);
		}
		return initialNumber1;
	}
}
