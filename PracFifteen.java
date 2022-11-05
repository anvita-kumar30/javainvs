import java.util.Scanner;
//create ATM class to implement the ATM functionality  
class InsuffBalanceException extends Exception {
    public InsuffBalanceException(String msg) {
        super(msg);
    }
}
public class PracFifteen {
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
                    try{
                        //show custom error message   
                        throw new InsuffBalanceException("Insufficient Balance(the amount to be removed is greater than the balance)");  
                    }
                    catch(InsuffBalanceException e){
                        System.out.println(e.getMessage());
                    }
                }  
                System.out.println("");  
                break;  
   
                case 2:  
                System.out.print("Enter money to be deposited: ");  
                deposit = sc.nextInt();  
                //add the deposit amount to the total balanace  
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited");  
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