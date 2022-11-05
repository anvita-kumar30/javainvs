import java.util.Scanner;
class WrongException extends Exception {
    public WrongException(String msg) {
        super(msg);
    }
}
public class PracSeventeen {
        public static void main(String[] args) {
        String pm="Narendra Modi";
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++){
            System.out.println("Who is the Prime Minister of India?");
            String name=sc.nextLine();
            if(name.equalsIgnoreCase(pm)){
                System.out.println("Excellent");
                break;
            }
            else{
                if(i<2){
                    try{
                        throw new WrongException("Try Again");
                    }
                    catch(WrongException e){
                        System.out.println(e.getMessage());
                    }
                }
                else{
                    System.out.println("The Prime Minister of India is Narendra Modi");
                }
            }
        }
    }
}
