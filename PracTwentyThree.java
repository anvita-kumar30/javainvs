import java.util.Scanner;
class NotPalindromeException extends Exception {
    public NotPalindromeException(String msg) {
        super(msg);
    }
}
public class PracTwentyThree {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a string as an input to check whether it is palindrome or not: ");
            String input= scanner.nextLine();
            //checking whether palindrome or not
            if(isPalindrome(input))
            {
                System.out.println(input+" is a palindrome string");
            }
            else
            {
                try{
                    throw new NotPalindromeException("Exception: String is not a palindrome");
                }
                catch(NotPalindromeException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        public static boolean isPalindrome(String str) {
            int left = 0, right = str.length() - 1;
            while(left < right)
            {
                if(str.toLowerCase().charAt(left) != str.toLowerCase().charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }


    
