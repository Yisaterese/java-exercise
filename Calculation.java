import java.util.Scanner;

public class Caculation{
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

System.out.printf("sumOfNumbers %d%n differenceOfNumbers %d%n productOfNumbers %d%n averageOfNumbers %d%n", number1,number2);





}





}