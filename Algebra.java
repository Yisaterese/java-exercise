import java.util.Scanner;

public class Algebra{
public static void main(String[] args){
Scanner input  = new Scanner(System.in);

System.out.print("enter number1");
int number1 = input.nextInt();

System.out.print("enter number2");
int number2 = input.nextInt();

int sumOfNumbers = number1 + number2;
int differenceOfNumbers = number2 - number1;
int productOfNumbers = number1 * number2;
int averageOfNumbers = (number1 + number2)/2;

 
System.out.printf("Algebra is %d%n %d%n  %d%n  %d%n", sumOfNumbers,differenceOfNumbers,productOfNumbers,averageOfNumbers);

if(number1 > number2){
System.out.print(number2 == number1);
}

if(number2 < number1){
System.out.print(number1 == number2);
}




}





}