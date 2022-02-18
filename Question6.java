import java.util.*;

public class Question6 {
    public static void main(String[] args)
    {
        int number, power, count;
        int total = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        number = input.nextInt();
        System.out.println("Enter power ");
        //number = input.nextInt(); By printing the variable number we can notice that the user input is stored in the wrong variable (has to be power)
        power = input.nextInt();
        count = 1;
        while (count <= power )
        {
            total = total*number;
            count++; // There was no increament resulting an endless loop

        }
        System.out.println(" the answer is " + total);
    }

}

