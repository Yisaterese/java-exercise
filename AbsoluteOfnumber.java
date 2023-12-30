import java.util.Scanner;

public class AbsoluteOfNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number: ");
int number = scanner.nextInt();
int num = 0;

for(num = 1; num <= number; num++){
if(number == 0 ){
	System.out.print(number);
	}
if(number < 0){
	
	System.out.print(number);
	}
if(number > 0){
	
	System.out.print( number);
	}	
System.out.printf("the absolutenumber is: %d", number);
	}
}
}