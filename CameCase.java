import java.util.Scanner;

public class CameCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String temp = s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                System.out.print(temp.charAt(i));
                continue;
            }
            if (s.charAt(i - 1) == ' ') {
                System.out.print(temp.charAt(i));
                continue;
            }
            System.out.print(s.toLowerCase().charAt(i));
        }
    }
}
