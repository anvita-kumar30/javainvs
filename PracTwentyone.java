import java.util.*;
class CheckIfTwoArraysAreEqual {
    static boolean areSameSet(int[] a, int[] b){
        HashSet s1 = new HashSet<Integer>();
        HashSet s2 = new HashSet<Integer>();
        for(int i = 0 ; i < a.length; i++) {
            s1.add(a[i]);
        }
        for(int i = 0 ; i <b.length; i++) {
            s2.add(b[i]);
        }
        if(s1.containsAll(s2) && s2.containsAll(s1))
        {
            System.out.println("Same elements in both");
            return true;
        }
        else
        {
            System.out.println("Not same elements in both");
            return false;
        }

    }
}
public class PracTwentyone{
    public static void main(String[] args)
    {
        CheckIfTwoArraysAreEqual a=new CheckIfTwoArraysAreEqual();
        int[] A = { 1 ,4,9,16,9,7,4,9,11  };
        int[] B = { 11,11,7,9,16,4,1, };
        if (a.areSameSet(A, B))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
    
