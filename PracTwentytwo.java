import java.util.Scanner;
class Myexception extends Exception {
    public String toString() {
        return ("Sorry! for the inconvenience, looks like book is not available.");
    }
}
class book {
    String author, title;
    int price, stock;
    book(String author, String title, int price, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.stock = stock;
    }
}
class PracTwentytwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        book b[] = new book[100];
        b[0] = new book("Jk Rowling", "Harry Potter", 10000, 15);
        b[1] = new book("Mark Twain", "Adventures of Tom Sawyer", 20000, 10);
        b[2] = new book("Eichiro Oda", "One Piece", 30000, 5);
        b[3] = new book("Kishimoto Masashi", "Naruto", 25000, 40);
        b[4] = new book("Gege Akutami", "Jujutsu kaisen", 40000, 25);
        b[5] = new book("Yusuke Murata", "One Punch Man", 50000, 67);
        System.out.println("HELLO!");
        System.out.print("Please Enter title of the book: ");
        String titl = sc.nextLine();
        int flag = 0, store = 0;
        for (int i = 0; i < 6; i++) {
            if (titl.equalsIgnoreCase(b[i].title)) {
                flag = 1;
                store = i;
                break;
            }
        }
        try {
            if (flag == 1) {
                System.out.println("BOOK DETAILS: ");
                System.out.println("\nName of Book: " + b[store].title);
                System.out.println("Name of Author: " + b[store].author);
                System.out.println("Price per book in RS: " + b[store].price);
                System.out.println();
                System.out.print("Enter the no. of copies you want to purchase: ");
                int n = sc.nextInt();
                if (n > b[store].stock) {
                    System.out.println("\nRequired Copies not in stock.");
                } else {
                    System.out.println("Thank You for visiting us!");
                    System.out.println("\nTotal price you have to pay: " + (n * b[store].price));
                    System.out.println("\nLooking forward for you........");
                }
            } else if (flag == 0) {
                throw new Myexception();
            }
        } 
        catch (Myexception e) {
            System.out.print("ExceptionCaught:");
            System.out.print(e);
        }
    }
}