// // import java.util.*;
// // import java.util.Arrays;
// // public class PracTwenty {
// //    public static void main(String args[]) {
// //     int vowels = 0; 
// //     int consonants = 0;
// //     Scanner sc = new Scanner(System.in);
// //     System.out.println("Enter a string value: ");
// //     String str = sc.nextLine();
// //     char ch[] = str.toCharArray();
// //     //for(int i=0; i<ch.length; i++)
// //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
// //         ++vowels;
// //     }
// //     else {
// //         ++consonants;
// //     }
// //     System.out.println("The number of vowels in the string is "+vowels+"\nThe number of consonants in the string is "+consonants);
// //    }
// // }

// // Java program to Sort a String Alphabetically
// // Using toCharArray() method
// // Without using sort() method
// // Importing required classes
// // import java.io.*;
// // import java.util.Arrays;
// // class PracTwenty {
// //     public static void main(String[] args) throws Exception
// //     {
// //         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// //         System.out.println("Enter a sentence");
// //         String str = br.readLine();
// //         // Converting string into an array for computation
// //         String[] a = str.split(" ");
// //         for (int k = 0; k < a.length; k++) {
// //             char arr[] = str.toCharArray();
// //             // Nested loops for comparison of characters in above character array
// //             char temp;
// //             int i = 0;
// //             while (i < arr.length) {
// //                 int j = i + 1;
// //                 while (j < arr.length) {
// //                     if (arr[j] < arr[i]) {
// //                         // Comparing the characters one by one
// //                         temp = arr[i];
// //                         arr[i] = arr[j];
// //                         arr[j] = temp;
// //                     }
// //                     j += 1;
// //                 }
// //                 i += 1;
// //             }
// //         }
// //         // By now loop is done means we have iterated the whole array
// //         System.out.println(a);
// //     }
// // }

// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.Vector;
// public class PracTwenty {
//     public static void main(String[] args) {
//         int vowels = 0; 
//         int consonants = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a sentence: ");
//         String s = sc.nextLine();
//         Vector<String> ans = new Vector<>();
//         int start = 0;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == ' ') {
//                 ans.add(s.substring(start, i));
//                 start = i + 1;
//             }
//         }
//         ans.add(s.substring(start));
//         for (int i = 0; i < ans.size(); i++) {
//             char tempArr[] = ans.get(i).toCharArray();
//             Arrays.sort(tempArr);
//             ans.set(i, new String(tempArr));
//         }
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
//                 ++vowels;
//             } else if(s.charAt(i) != ' ') {
//                 ++consonants;
//             }
//         }
//         System.out.println("\nThe number of vowels in the string is "+vowels+"\nThe number of consonants in the string is "+consonants);
//     }
// }

import java.util.*;
public class PracTwenty {
    public static void main(String args[]){
        int vowels = 0;          
        int consonants = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        String[] nstr = str.split(" ");
        String sort="";
        for(int p =0;p<nstr.length;p++){
            char arr[] = nstr[p].toCharArray();
            for(int i =0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        char ch = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=ch;
                    }
                }
            }
            sort = sort + " " + String.valueOf(arr);
        }
        System.out.println(sort.trim());
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
