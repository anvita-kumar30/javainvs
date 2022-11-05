import java.util.*;

class Pharmacy {
    int rate, quantity, rupees;
    String name;
    void getdata(String n, int r, int q) {
        this.name = n;
        this.rate = r;
        this.quantity = q;
    }
}
public class PracFive {
    public static void main(String args[]) {
        int rupees;
        int total=0;
        Pharmacy temp = new Pharmacy();
        Pharmacy p[] = new Pharmacy[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter the name, rate and quantity of the medicines: ");
            String n = sc.next();
            int rate = sc.nextInt();
            int quantity = sc.nextInt();
            p[i] = new Pharmacy();
            p[i].getdata(n, rate, quantity);
        }
        for (int i = 1; i < 4; i++) {
            p[i].rupees= p[i].rate * p[i].quantity;
        }
        System.out.println("\nNo.\t\tName\t\tRate\t\tQuantity\t\tRupees");
        for (int i = 1; i < 4; i++) {
            System.out.println("\n"+ i + "\t\t" + p[i].name + "\t\t" + p[i].rate + "\t\t" +p[i].quantity+ "\t\t\t" + p[i].rupees);  
        }
        for (int i = 1; i < 4; i++){
            total= total + p[i].rupees;
        }
        System.out.println("\n\n\t\t\t\t\t\t\t\t Total: " + total);
    }
}