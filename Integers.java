import java.util.Scanner;
public class Integers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("enter number1");
int number1 = scanner.nextInt();
System.out.println("enter number2");
int number2 = scanner.nextInt();
int sum = number1 + number2;
int difference = number1 - number2;
int product = number1 * number2;
int average = (number1 + number2)/2;
System.out.printf("%d%n, %d%n %d%n, %d%n", sum, difference, product, average);

if(number1 > number2 ){ 
System.out.print("number1 > number2");
}


if(number2 > number1 ){ 

System.out.print("number2 > number1");

}

}

}



