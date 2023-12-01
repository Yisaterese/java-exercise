import java.util.Scanner;

public class MultiplicationTable{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number");
int input = scanner.nextInt();

int count = 1;
if(input < 1 && input < 10 );

while (count <= 12){
	int product = input * count;
	}
	System.out.printf(" %d x %d = %d%n ", input,count,product);
	count++;
	}
else{
	System.out.print("Invalid number ");
}
}
}