import java.util.Scanner;
public class Exchange{
public static void main(String[] args){
Scanner input = new Scanner(System.in);


 System.out.print("enter exchange rate   ");
double exchangeRate = input.nextDouble();

System.out.print("enter 0 or 1 to convert from dollars to RMB and vice versa ");
double decision = input.nextDouble();

System.out.print("enter dollar amount:");
double dollarAmount = input.nextDouble();
System.out.print("enter RMB amount:");
double amountInRMB = input.nextDouble();

double dollarsToRMB = dollarAmount * exchangeRate ;
double RmdToDollar = amountInRMB / exchangeRate;

if(decision == 0){
System.out.printf("$%.1f  is %.1f yuan ", dollarAmount, dollarsToRMB);
}

if(decision == 1){
System.out.printf("%.1f yuan is $%.1f", amountInRMB, RmdToDollar);
}


}
}