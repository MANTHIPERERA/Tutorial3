import java.util.Scanner;

public class Question4 {
	public static void main (String[] args) {

		int fibonacciVal1 = 1;
		int fibonacciVal2 = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the nth term for your fibonicci series");
		int loopingCount = input.nextInt();

		System.out.println(fibonacciVal1);
		System.out.println(fibonacciVal2);

		for(int i = 1; i<=loopingCount; i++) {
			

			int fibonacciFinal = fibonacciVal1 + fibonacciVal2;

			fibonacciVal1 = fibonacciVal2;
			fibonacciVal2 = fibonacciFinal;

			System.out.print(fibonacciFinal + ",");

			
			
		}


	}
}