import java.util.Scanner;

public class AccountTest1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();

			
			 
			account.setAccountName("Joseph Yisa ");
			account.setBalance(5_000_000);
			account.setAccountNumber("013452896");
			String accountNumber = account.setAccountNumber("013452896");

System.out.printf("Your account name is: %s" getName());
System.out.printf("Your account number is: %s",getAccountNumber());

System.out.printf("Enter deposit amount: ");
double deposit = scanner.nextDouble();
System.out.printf("Your new balance is: #% %f ",account.getBalance());


System.out.printf("Enter withdrawal amount: ");
double withdrawal = scanner.nextDouble();
System.out.printf("Your new balance is: #% %f ",account.getBalance());





}
}