package Project;
import java.util.*;


public class BankingApplication {
    
    public static void main(String[] args) {
         BankAccount obj1 = new BankAccount("SOUMIK", "B153");
         obj1.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customer_Name;
    String customer_Id;

    BankAccount(String cname, String cid){
        customer_Name = cname;
        customer_Id = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdral(int amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getpreviousTransaction(){
        if(previousTransaction > 0 ){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdron: " + Math.abs(previousTransaction));
        }
        else{
            System.out.println("No transaction occured");
        }
    }

    void showMenu(){
      
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome " + customer_Name);
        System.out.println("You Id is: " + customer_Id);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("================================================================");
            System.out.println("ENTER AN OPTION");
            System.out.println("================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

        
            switch(option){

                case 'A' :
                System.out.println("------------------------------------------");
                System.out.println("Balance = " + balance);
                System.out.println("------------------------------------------");
                System.out.println("\n");
                break;

                case 'B':
                System.out.println("--------------------------------------------");
                System.out.println("Enter the amount to deposit");
                System.out.println("--------------------------------------------");
                int amount = sc.nextInt();
                deposit(amount);
                System.out.println("\n");
                break;


                case 'C':
                System.out.println("---------------------------------------------");
                System.out.println("Enter the amount to withdraw");
                System.out.println("---------------------------------------------");
                int amount2 = sc.nextInt();
                withdral(amount2);
                System.out.println("\n");
                break;


                case 'D':
                System.out.println("-------------------------------------------------");
                getpreviousTransaction();
                System.out.println("---------------------------------------------");
                System.out.println("\n");
                break;

                case 'E':
                System.out.println("----------------------------------------");
                break;

                default:
                System.out.println("Invalid option! Please enter again");
                break;
    

            }
        }
        while(option != 'E');
        {
            System.out.println("Thank you for using our service");
        }
    }
}