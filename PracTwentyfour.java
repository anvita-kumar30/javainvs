import java.util.Scanner;
class BranchException extends Exception {
    BranchException(String s) {
        super(s);
    }
}
public class PracTwentyfour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        Student arr[] = new Student[n];
        System.out.println("Enter name branch and id for each student");
        for (int i = 0; i < n; i++) {
            arr[i] = new Student();
            arr[i].setData();
            try {
                if (!(arr[i].branch.equals(new String("Comps")) || arr[i].branch.equals(new String("IT")))) {
                    System.out.println(arr[i].branch);
                    throw new BranchException("Student is not from IT or comps");
                }
            } 
            catch (BranchException e) {
                System.out.println(e);
            }
        }
        System.out.println("Number of students from Comps or IT are: " + Student.count(arr));
    }
}
class Student {
    int id;
    String name, branch;
    static String collegeName = new String("TSEC");
    void setData() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        branch = sc.next();
        id = sc.nextInt();
    }
    static int count(Student arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].branch.equals("Comps") || arr[i].branch.equals("IT"))
                ans++;
        }
        return ans;
    }
}
