import java.util.Scanner;
//create ATM class to implement the ATM functionality  
class DepositException extends Exception {
    public DepositException(String msg) {
        super(msg);
    }
}
public class PracEighteen {
    public static void main(String args[] )  
    {   
        int balance = 100000, withdraw, deposit, c;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Automated Teller Machine"); 
        System.out.println("Choose 1 for Withdraw of amount");  
        System.out.println("Choose 2 for Deposit of amount");  
        System.out.println("Choose 3 for Statement of balance");  
        do
        {
            System.out.print("Choose the operation you want to perform: ");   
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                System.out.print("Enter money to be withdrawn: ");  
                withdraw = sc.nextInt();
                //check whether the balance is greater than or equal to the withdrawal amount  
                if(balance >= withdraw)  
                {  
                    //remove the withdrawl amount from the total balance  
                    balance = balance - withdraw;  
                    System.out.println("Please collect your money");  
                }  
                else  
                {  
                    System.out.println("Insufficient Balance(the amount to be removed is greater than the balance)");  
                }  
                System.out.println("");  
                break;  
   
                case 2:  
                System.out.print("Enter money to be deposited: ");  
                deposit = sc.nextInt(); 
                if(deposit > 100000){
                    try{
                        throw new DepositException("The amount to be deposited is greater than 1,00,000 Rs");
                    }
                    catch(DepositException e){
                        System.out.println(e.getMessage());
                    }
                }
                else{
                    //add the deposit amount to the total balanace  
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully deposited"); 
                }
                System.out.println("");  
                break;  
   
                case 3:  
                //displaying the total balance of the user  
                System.out.println("Balance: "+balance);  
                System.out.println("");  
                break;  
            }  
            System.out.println("Do you want to continue(enter 1 for yes else no): ");
            c = sc.nextInt();
        }while(c==1);
    }
}
