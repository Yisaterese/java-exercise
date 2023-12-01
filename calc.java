import java.util.Scanner;

public class CalculateNumbers{
public static void main(String[] args){
Scanner input  = new Scanner(System.in);

System.out.print("enter number1");
int number1 = input.nextInt();
System.out.print("enter number2");
int number2 = input.nextInt();
System.out.print("enter number3");
int number3 = input.nextInt();

int sumOfNumbers = number1 + number2 + number3;
int productOfNumbers = number1 * number2 * number3;
int averageOfNumbers = (number1 + number2 + number3)/3;

if(number1 > number2 && number3){
System.out.printf("max: %d > %d && %d");
}

if(number1 < number2 && number3){
System.out.printf("max: %d < %d && %d");
}
if(number2 > number3 && number1){
System.out.printf("max: %d > %d && %d");
}

if(number2 < number3 && number1){
System.out.printf("max: %d < %d && %d");
}

if(number3 > number2 && number1){
System.out.printf("max: %d > %d && %d");
}

if(number3 < number2 && number1){
System.out.printf("max: %d < %d && %d");
}

}





}