import java.util.*;
public class Question7
{
    public static void main(String[] args) {
        int number, count, factorial;
         factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        number = input.nextInt();
        count = 1;
        while (count <= number )
        {
//            number = count;
            factorial = factorial * count;
            count++;
        }
        System.out.println("the factorial is " + factorial);
    }
}
