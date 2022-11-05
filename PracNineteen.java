import java.util.Arrays;
import java.util.Scanner;
public class PracNineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        Telephone arr[] = new Telephone[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            sc.nextLine();// buffer issue
            String s = sc.nextLine();
            System.out.print("Enter phone no: ");
            int num = sc.nextInt();
            System.out.print("Enter the pincode: ");
            int pin = sc.nextInt();
            arr[i] = new Telephone(s, num, pin);
            System.out.println("");
        }
        // Sort the array in ascending order using two for loops
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].pincode > arr[j].pincode) { // swap elements if not in order
                    temp = arr[i].pincode;
                    arr[i].pincode = arr[j].pincode;
                    arr[j].pincode = temp;
                }
            }
        }
        Display.display(arr);
    }
}
class Telephone {
    String name;
    int pincode, phoneno;
    Telephone(String name, int phoneno, int pincode) {
        this.name = name;
        this.phoneno = phoneno;
        this.pincode = pincode;
    }
}
class Display {
    static void display(Telephone arr[]) {
        System.out.println("Name\t\tPhone Number\tPincode");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + "\t\t" + arr[i].phoneno + "\t\t" + arr[i].pincode);
        }
    }
}
    