import java.util.*;

public class Main
{
	public static void main(String[] args) {
	       Customer customer = new Customer(101, "abcd", "abc@gmail.com");
	        SavingsAccount savingsAccount = new SavingsAccount(1001, customer, 11000, 500);
	        if (savingsAccount.withdraw(9000)) {
	            System.out.println(savingsAccount.getBalance());
	        }     
	}
}