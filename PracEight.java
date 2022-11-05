import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class PracEight {

    public static void main(String[] args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter 1st integer: ");
        int firstInt = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd integer: ");
        int secondInt = Integer.parseInt(br.readLine());
        System.out.printf("Sum of two integers: %d%n", firstInt + secondInt);
        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
        System.out.printf("Product of two integers: %d%n", firstInt * secondInt);
        System.out.printf("Average of two integers: %.2f%n", (double) (firstInt + secondInt) / 2);
        System.out.printf("Max integer: %d%n", (firstInt>secondInt?firstInt:secondInt)); //Math.max(firstInt, secondInt)
        System.out.printf("Min integer: %d%n", Math.min(firstInt, secondInt));
        System.out.println("The sequence of individual digits in the 1st integer is: ");
        String string_number = Integer.toString(firstInt);
        for (int i = 0; i < string_number.length(); i++) {
            System.out.print(" "+string_number.charAt(i));
        }
        System.out.print("\n");
        System.out.println("The sequence of individual digits in the 2nd integer is: ");
        String string_number2 = Integer.toString(secondInt);
        for (int i = 0; i < string_number2.length(); i++) {
            System.out.print(" "+string_number2.charAt(i));
        }
    }
}

