import java.util.Scanner;

public class SmallestLargest2{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("enter three numbers:");
int number1 = input.nextInt();
int number2 = input.nextInt();
int number3 = input.nextInt();

int sumOfNumbers = number1 + number2 + number3;
int averageOfNumbers = (number1 + number2 + number3)/3;
int productOfNumbers = number1 * number2 * number3;

System.out.printf("the sum of numbers is %d%nthe average of numbers is %d%nthe  product of numbers is %d%n", sumOfNumbers, averageOfNumbers, productOfNumbers);

int maximum = 0;
int minimum = number1;

if (number1 > number2 && number1 > number3 ){
System.out.printf("%d is maximum: ",number1 );
}
if (number1 < number2 && number1 < number3){
System.out.printf("%d is minimum ", number1);
}
if (number2 > number1 && number2 > number3){
 
System.out.printf("%d && maximum ",number2);
}
if (number2 < number1 && number2 < number3){
System.out.printf("%d is minimum ", number2);
}
if (number3 > number1 && number3 > number2){
System.out.printf("%d is maximum", number3);

}
if (number3 < number1 && number3 < number2){
System.out.printf("%d is mainimum ", number3);

}


}

} 