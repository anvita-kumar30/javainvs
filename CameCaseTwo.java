import java.util.Scanner;

public class CameCaseTwo {
 
    public static String toCamelCase(String str) {
        String[] wordList = str.toLowerCase().split("_");
        String finalStr = "";
        for (String word : wordList) {
            finalStr += capitalize(word);
        }
        return finalStr;
    }

    public static String capitalize(String line) {
        return Character.toUpperCase(line.charAt(0)) + line.substring(1);
    }

    public static void main( String args[ ] )  
    {  
       
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String s=sc.nextLine();
System.out.println(toCamelCase(s));  
    }  
}