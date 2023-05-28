import java.util.Scanner;
public class Main
{
    public static void main(String args[] )
    {
        int balance = 10000000, withdraw, deposit,transactions = 0,Transfer;
        String transactionHistory = " ",password = "Ta@090902",pin= "5211", Username ="Priti Gupta";
        Scanner sc = new Scanner(System.in);
        System.out.println("************* Enter your Login Details **************");
        System.out.println("Enter your Username:");
        String username = sc.nextLine();
        System.out.println("Enter Password:");
        String Pass = sc.nextLine();
        System.out.println("Enter Pin:");
        String Pn = sc.nextLine();

        if(username.equals(Username) && Pass.equals(password) && Pn.equals(pin))
        {
            System.out.println("Access Granted");
            while(true)
            {
                System.out.println("******Automated Teller Machine******");
                System.out.println(" 1.Withdraw");
                System.out.println(" 2.Deposit");
                System.out.println(" 3.Check Balance");
                System.out.println(" 4.Transfer");
                System.out.println(" 5.View Transaction History");
                System.out.println(" 6.Quit");
                System.out.print("Choose the operation you want to perform:");

                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if(balance >= withdraw)
                        {
                            System.out.println("Confirm? Y/N");
                            String confirm=sc.next();
                            if(confirm.equals("Y"))
                            {
                                balance = balance - withdraw;
                                System.out.println("Please collect your money");
                                transactions ++;
                                String str = withdraw + "Rs Withdrawn" +"\n";
                                transactionHistory = transactionHistory.concat(str);
                            }
                            else
                            {
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;

                    case 2:

                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();


                        balance = balance + deposit;
                        System.out.println("Your Money has been deposited successfully");
                        System.out.println("");
                        transactions ++;
                        String str = deposit + " Rs Deposited" +"\n";
                        transactionHistory = transactionHistory.concat(str);
                        break;

                    case 3:

                        System.out.println("Balance : "+balance);
                        System.out.println("");
                        break;
                    case 4:
                        System.out.print("Enter money to be Transferred:");
                        Transfer = sc.nextInt();
                        if(balance >= Transfer)
                        {
                            System.out.println("Confirm? Y/N");
                            String confirm=sc.next();
                            if(confirm.equals("Y"))
                            {
                                balance = balance - Transfer;
                                System.out.println("Amount Transferred");
                                transactions ++;
                                String Str = Transfer + " Rs Transferred" +"\n";
                                transactionHistory = transactionHistory.concat(Str);
                            }
                            else
                            {
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        System.out.println("");
                        break;
                    case 5:

                        if(transactions ==0)
                        {
                            System.out.println("No Transactions are done");
                        }
                        else
                        {
                            System.out.println("\n" +transactionHistory);

                        }
                        break;

                    case 6:

                        System.exit(0);
                }
            }
        }

    }
}  