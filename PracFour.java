import java.util.*;

public class PracFour {
    public static void main(String args[]){
        int vowels = 0;          
        int consonants = 0;
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=sc.nextLine();
        System.out.println("The string after removing all the extra spaces is: \n"+str.replaceAll("\\s+"," ").trim());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                ++vowels;
            } else if (str.charAt(i) != ' ') {
                ++consonants;
            }
        }
        System.out.println("The number of vowels in the string is " + vowels
                + "\nThe number of consonants in the string is " + consonants);
    }
}

// import java.util.Scanner;

// public class PracFour {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String s = sc.nextLine();
//         String ans = "";
//         s = s.trim();
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 ans += s.charAt(i);
//                 while (s.charAt(i + 1) == ' ')
//                     i++;
//                 continue;
//             }
//             ans += s.charAt(i);
//         }
//         System.out.println(ans);
//     }
// }