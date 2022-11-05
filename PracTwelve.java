import java.util.*;
public class PracTwelve {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int option, c;
        System.out.println("Choice 1: Read a floating-point number. If the number is zero it prints \"zero\",otherwise, print \"positive\" or \"negative\".");
        System.out.print("Choice 2: Read an integer and count the number of digits the number has.");
        System.out.print("\nChoice 3: Accept three numbers and print \"All numbers are equal\" if all three");
        System.out.print(" numbers are equal, \"All numbers are different\" if all three numbers are different and \"Neither all are equal or different\" otherwise.\n");
        do {
            System.out.println("\nEnter your option: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a number: ");
                    double number = sc.nextDouble();
                    if (number > 0)
                    {
                        if (number < 1) {
                            System.out.println("Positive small number");
                        } else if (number > 1000000) {
                            System.out.println("Positive large number");
                        } else {
                            System.out.println("Positive number");
                        }
                    } 
                    else if (number < 0) {
                        if (Math.abs(number) < 1) {
                            System.out.println("Negative small number");
                        } else if (Math.abs(number) > 1000000) {
                            System.out.println("Negative large number");
                        } else {
                            System.out.println("Negative number");
                        }
                    } 
                    else
                    {
                        System.out.println("Zero");
                    }
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    long num = sc.nextLong();
                    int count = 0;
                    while (num != 0) {
                        num = num / 10;
                        ++count;
                    }
                    System.out.println("Number of digits: "+ count);
                    break;
                case 3:
                    System.out.print("Input first number: ");
                    int x = sc.nextInt();
                    System.out.print("Input second number: ");
                    int y = sc.nextInt();
                    System.out.print("Input third number: ");
                    int z = sc.nextInt();
                    if (x == y && x == z) {
                        System.out.println("All numbers are equal");
                    } 
                    else if ((x == y) || (x == z) || (z == y)) {
                        System.out.println("Neither all are equal or different");
                    } 
                    else {
                        System.out.println("All numbers are different");
                    }
                    break;
            }
            System.out.println("Do you want to continue(enter 1 for yes else no): ");
            c = sc.nextInt();
        } while (c == 1);
    }
}
