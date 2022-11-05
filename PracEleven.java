// import java.util.*;
// public class PracEleven {
//     static String convert(String s){
//         // to keep track of spaces
//         int cnt = 0;
//         // variable to hold the length of the string 
//         int n = s.length();
//         // converting the string expression to character array
//         char ch[] = s.toCharArray();
//         // keep track of indices of ch[ ] array   
//         int res_ind = 0;
//         for (int i = 0; i < n; i++)
//         {
//             // The first position of the array i.e., the first letter must be  
//             // converted to the upper case. We checked this before the second  
//             // if statement as that statement is executed only when it encounters space and,  
//             // there is no space before the first letter of a string.  
//             if( i == 0 )
//                 ch[i] = Character.toUpperCase( ch[i] );  
//             // check for spaces in the sentence
//             if (ch[i] == ' ')
//             {
//                 cnt++;
//                 // conversion into upper case
//                 ch[i + 1] = Character.toUpperCase(ch[i + 1]);
//                 continue;
//             }
//             // If not space, copy character
//             else
//                 ch[res_ind++] = ch[i];
//         }
//         // new string will be reduced by the
//         // size of spaces in the original string
//         return String.valueOf(ch, 0, n - cnt);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a sentence: ");
//         String str=sc.nextLine();
//         System.out.println(convert(str));
//     }
// }

import java.util.*;
public class PracEleven  
{  
    // function to convert the string into upper camel case  
    static String convertString( String s )  
    {  
        // converting the string expression to character array  
        String[] str = s.split("");
        StringBuilder builder = new StringBuilder();
      
        for(String a: str) {
            for(int i = 0 ; i < a.length(); i++){
            char currentChar = a.charAt(i);
            if (i == 0) {
             builder.append(Character.toUpperCase(currentChar));
            } else {
                builder.append(Character.toLowerCase(currentChar));
            }
         }
        }
        return builder.toString();
 
    }  
    // Driver code  
    public static void main( String args[ ] )  
    {  
       
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
System.out.println(convertString(s));  
    }  
}