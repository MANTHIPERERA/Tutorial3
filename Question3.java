import java.util.Scanner;

public class Question3{
	public static void main(String[] args) {

		String letter ;
		int number;

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a letter");
		letter = input.next();

		System.out.println("Enter a number");
		number = input.nextInt();

		int i = 1;

		while (i <= number){
			System.out.print(letter);
			i ++;
		}

	}
}