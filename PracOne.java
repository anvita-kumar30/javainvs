import java.util.Scanner;
interface Exam {
    public boolean pass(int marks);
  }
interface Classify{
    public String division(int average);
}
class Result implements Exam, Classify{
    public boolean pass(int marks){
        if(marks>40){
            return true;
        }
        else{
            return false;
        }
    }
    public String division(int average){
        if(average>=80 && average<=100){
            return "First"; 
        }
        else if(average>=60 && average<=80){
            return "Second";
        }
        else{
            return "Third";
        }
    }
}
class PracOne{
    public static void main(String args[]){
        int marks, average;
        boolean pass;
        String division;
        Scanner sc=new Scanner(System.in);
        Result r1=new Result();
        System.out.println("Enter the marks obtained in the 3 subjects: ");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        marks=m1+m2+m3;
        average=marks/3;
        System.out.println("Average is: "+average);
        pass=r1.pass(marks);
        division=r1.division(average);
        if(pass)
            System.out.println("Passed\n"+division);
        else
            System.out.println("Failed\n"+division);
    }
}