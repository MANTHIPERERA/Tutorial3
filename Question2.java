import java.util.Scanner;

public class Question2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int userInput1;
		int userInput2;

		System.out.println("Enter number 1");
		userInput1 = input.nextInt();

		System.out.println("Enter number 2");
		userInput2 = input.nextInt();

		System.out.println("---------------------------------");

		if (userInput1 < userInput2) {
			for (int i = userInput1+1 ; i < userInput2 ; i ++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Please enter a lower value to number 1");
		}
		

	}
}