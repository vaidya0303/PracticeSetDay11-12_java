import java.util.Scanner;

/**
* Modify class Account to provide a method called debit that withdraws money
* from an Account. Ensure that the debit amount does not exceed the Account’s
* balance. If it does, the balance should be left unchanged and the method
* should print a message indicating ―Debit amount exceeded account balance.
* Modify class AccountTest to test method debit.
*
*/

public class StockManagement {

    private double balance;	// instance variable that stores the balance

    // constructor
    public StockManagement( double initialBalance )
    {
        // validate that initialBalance is greater than 0.0;
        // if it is not, balance is initialized to the default value 0.0
        if ( initialBalance > 0.0 )
            balance = initialBalance;
    } // end Account constructor

    // credit (add) an amount to the account
    public void credit( double amount )
    {
        balance = balance + amount;	// add amount to balance
    } // end method credit

    // debit (deduct) an amount to the account
    public void debit( double debitAmount )
    {


        if (debitAmount > balance)
        {
            debitAmount = 0.0;
            System.out.println( "Debit amount exceeded account balance." );
        }
        balance = balance - debitAmount;
    } // end method debit

    // return the account balance
    public double getBalance()
    {
        return balance; // gives the value of balance to the calling method
    } // end method getBalance


    public static void main(String[] args){

        StockManagement account1 = new StockManagement( 10000 ); // create DebitAccount object
        StockManagement account2 = new StockManagement( 500 ); // create DebitAccount object

        // display initial balance of each object
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        double withdrawAmount; // debit amount read from user

        System.out.print( "Enter debit amount for account1: " ); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("\ndeducting %.2f from account1 balance\n\n", withdrawAmount );
        account1.debit(withdrawAmount); // deduct from account1 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        System.out.print( "Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
        account2.debit( withdrawAmount ); //deduct from account2 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
    } // end main
} // end class DebitAccount Test