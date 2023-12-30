import java.util.Scanner;

public class AccountTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Account2 account2 = new Account2();

			account2.setName("Joseph Yisa");
			account2.setBalance(0.00);
			account2.setAccountNumber("013452896");
		

System.out.printf("Your account name is: %s%n", account2.getName());

System.out.printf("Your account number is: %s%n",account2.getAccountNumber());

System.out.print("Enter deposit amount: ");
double depositAmount = scanner.nextDouble();
account2.deposit(depositAmount);


System.out.printf("Your new balance is: #%.2f%n ",account2.getBalance());

System.out.print("Enter withdrawal amount: ");
double withdrawalAmount = scanner.nextDouble();
account2.withdrawal(withdrawalAmount);

}
}