import java.util.Scanner;
public class PracSixteen {
    public static final int PASSWORD_LENGTH = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. A password must have at least 10 characters.\n" +"2. A password consists of only letters and digits.\n" +"3. A password must contain at least two digits \n"+"4. The first letter must be a capital letter.\n" +"Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
        if (isValidPassword(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        char temp=password.charAt(0);
        char temp2=Character.toUpperCase(temp);
        if(temp!=temp2){
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch))
                numCount++;
            else if (Character.isAlphabetic(ch))
                charCount++;
            else
                return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
}
