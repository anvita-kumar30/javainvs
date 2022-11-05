import java.util.*;
import java.lang.*;
class AddNumbers extends Thread {
    public void run() {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("Enter the limit n: ");
        int n=sc.nextInt();
        System.out.println("First Thread: ");
        for (int i = 1; i <= n; i++) {
            sum= sum + i;
        }
        System.out.println("Sum: "+sum);
    }
}
class EvenNumbers implements Runnable {
    public void run() {
        int count=1;
        System.out.print("Second Thread:\n");
        for (int j = 2; j <= 20; j += 2) {
            if(count <= 10){
                System.out.println(j);
                count++;
            }
            else
                break;
        }
    }
}
class PracNine {
    public static void main(String h[]) {
        AddNumbers obj1 = new AddNumbers();
        obj1.start();
        EvenNumbers obj2 = new EvenNumbers();
        Thread t = new Thread(obj2);
        t.start();
        obj1.setPriority(5);
        t.setPriority(7);
    }
}