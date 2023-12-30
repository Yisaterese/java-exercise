public class Account2{

private String name;
private String accountNumber;
private double balance;

public void setName(String name){
        this.name = name;
        }
public String getName(){
        return name;
        }
public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        }
public String getAccountNumber(){
        return accountNumber;
        }
public void deposit(double depositAmount){
	if (depositAmount > 0.0){
	balance = balance + depositAmount;
	System.out.printf("#%.2f has succefully been deposited in your account%n", depositAmount);

	}
	else{
	System.out.println("Invalid transaction");
	}
	}
public void setBalance(double balanceAmount){
	if(balanceAmount > 0.00){
	this.balance = balance + balanceAmount;
	}
	
	}
public double getBalance(){
	return balance;
	}
public void withdrawal(double withdrawalAmount){
	 if(withdrawalAmount < 0.00){
	System.out.print("Invalid transaction");
	}
	else 
	if(withdrawalAmount <= balance ){
	balance = balance - withdrawalAmount;
	System.out.printf("#%.2f withdrawal is successful%n",withdrawalAmount);
	System.out.printf("Your new balance is: #%.2f%n ",balance);

	  }
	
	else{
	System.out.println("insifficient funds");
	  }
        }

}