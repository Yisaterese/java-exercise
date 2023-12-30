import java.util.Scanner;

public class LargestAndSmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("enter first number ");
int firstNumber = input.nextInt();

System.out.print("enter second number ");
int secondNumber = input.nextInt();

System.out.print("enter third number ");
int thirdNumber = input.nextInt();

System.out.print("enter fourth number ");
int fourthNumber = input.nextInt();

System.out.print("enter fifth number ");
int fifthNumber = input.nextInt();

int maximum = 0;
int minimum = firstNumber;

if(firstNumber > maximum){
 maximum = firstNumber;
}
if(firstNumber < minimum){
minimum = firstNumber;
}

if(secondNumber > maximum){
maximum = secondNumber;
}
if(secondNumber < minimum){
 minimum = secondNumber;
}

if(thirdNumber > maximum){
maximum = thirdNumber;
}
if(thirdNumber < minimum){
minimum = thirdNumber;
}

if(fourthNumber > maximum){
maximum = fourthNumber;
}
if(fourthNumber < minimum){
minimum = fourthNumber;
}

if(fifthNumber > maximum){
maximum = fifthNumber;
}
if(fifthNumber < minimum){
minimum = fifthNumber;
}
System.out.printf("the largest number is %d ",maximum);
System.out.printf(" and the smallest number is %d ",minimum);



}
}