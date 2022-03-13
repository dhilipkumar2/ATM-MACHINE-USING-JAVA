//import required classes and packages   1
    import java.util.Scanner;  
    import java.util.*;
    import java.text.*;
      
    //create ATMExample class to implement the ATM functionality  
    public class Main  
    {  
        //main method starts   
        public static void main(String args[] )  
        {  
            //declare and initialize balance, withdraw, and deposit  
            int balance = 0, withdraw, deposit,account_number,pin,t1=0,t2=0,t3=0,t4=0;  
            char receipt='Y' ;
            SimpleDateFormat formatDate = new SimpleDateFormat(
                    "dd/MM/yyyy  HH:mm:ss z");
            Date date = new Date();
            formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
            //create scanner class object to get choice of user  
            System.out.println("Welcome to Indian Bank ATM");
            String name="Dhilip Kumar";
            long phone=9566730287L;
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter the account number:");
            account_number=sc.nextInt();
            if(account_number==123456789)
            {
                System.out.println("Enter the PIN:");
                pin=sc.nextInt();
                if(pin==2002)
                {
                    System.out.println("\nYour Name: "+name+"    "+"Phone Number: "+phone);
                    System.out.println("\nAccount Number: 123456789" + "    "+ "Branch:Madurantakam");
            while(true)
            {  
                System.out.println("\nATM Machine\n");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");  
                System.out.println("Choose 4 for EXIT"); 
                System.out.println("Choose 5 for Mini Statement\n");
                System.out.print("Choose the operation:");  
                  
                //get choice from user  
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                    case 1:  
            System.out.print("Enter money to be withdrawn:");  
                          
            //get the withdrawl money from user  
            withdraw = sc.nextInt();  
                          
            //check whether the balance is greater than or equal to the withdrawal amount  
            if(withdraw >= balance)  
            {  
                
              //show custom error message   
                System.out.println("Insufficient Balance");  
            }  
            else  
            {  
            	//remove the withdrawl amount from the total balance  
                balance = balance - withdraw;  
                System.out.println("Please collect your money");  
                System.out.println("\nDo You want receipt? Y or N");
                String input = sc.next();
                receipt = input.charAt(0);
                System.out.println("Amount Withdrawn: "+withdraw+ "     "+ "Date&Time: "+formatDate.format(date));
                System.out.println("\nYour Current balance is:"+balance+ "      "+ "Account.No:123456789"); 
                t2=withdraw;
            }  
            System.out.println("");  
            break;  
       
                    case 2:  
                          
            System.out.print("Enter money to be deposited:");  
                          
            //get deposite amount from the user  
            deposit = sc.nextInt();  
                          
            //add the deposit amount to the total balanace  
            balance = balance + deposit;  
            System.out.println("Your Money has been successfully depsited");
            System.out.println("\nDo You want receipt? Y or N");
            String input = sc.next();
            receipt = input.charAt(0);
            System.out.println("Amount Deposited: "+balance+ "     "+ "Date&Time: "+formatDate.format(date));
            System.out.println("\nYour Current balance is:"+balance+ "      "+ "Account.No:123456789");
            t1=balance;
            System.out.println("\n");  
            break;  
       
                    case 3:  
            //displaying the total balance of the user 
            
            System.out.println("Balance : "+balance);  
            System.out.println("");  
            break;  
       
                    case 4:  
            //exit from the menu  
            System.exit(0);  
            break;
            
            case 5:
                System.out.println("\nMINI STATEMENT:");
                System.out.println("Date&Time: "+formatDate.format(date));
                System.out.println("Account Holder Name:= Dhilip Kumar");
                System.out.println("Account No: 123456789");
                System.out.println("\nAmount Deposited: "+t1);
                System.out.println("Amount Withdrawn: "+t2);
                }  
            }
            }else{
                System.out.println("Invalid PIN");
            }
            }
            else{
                System.out.println("Invalid account number");
            } 
        }  
    }  
