/**
 2 A cash register totals up sales and computes change due.
 3 */
public class CashRegister
{
           public static final double QUARTER_VALUE = 0.25;
           public static final double DIME_VALUE = 0.1;
          public static final double NICKEL_VALUE = 0.05;
           public static final double PENNY_VALUE = 0.01;
           private double purchase;
        private double payment;

/**   Constructs a cash register with no money in it. */

          public CashRegister()
        {purchase = 0;
        payment = 0;
        }
    /**
 24 Records the purchase price of an item.
 25 @param amount the price of the purchased item
 26 */
         public void recordPurchase(double amount)
{
    purchase = purchase + amount;
     }
 /**
 33 Processes the payment received from the customer.
 34 @param dollars the number of dollars in the payment
 35 @param quarters the number of quarters in the payment
 36 @param dimes the number of dimes in the payment
 37 @param nickels the number of nickels in the payment
 38 @param pennies the number of pennies in the payment
 39 */
 public void receivePayment(int dollars, int quarters,
int dimes, int nickels, int pennies)
 {
    payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
    + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }
/**
 48 Computes the change due and resets the machine for the next customer.
 49 @return the change due to the customer
 50 */
        public double giveChange()
{
     double change = payment - purchase;
    purchase = 0;
    payment = 0;
    return change;
    }
}