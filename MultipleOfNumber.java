import java.util.Scanner;

public class MultipleOfNumber{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("please enter first number:");
int firstNumber = input.nextInt();

System.out.print("please enter second number:");
int secondNumber = input.nextInt();

int tripleOfFirstNumber = firstNumber * 3;
int doubleOfSecondNumber = secondNumber *2;

if(tripleOfFirstNumber % doubleOfSecondNumber == 0 ){
 System.out.printf(   "%d is a multiple of %d", tripleOfFirstNumber, doubleOfSecondNumber );
}
if(tripleOfFirstNumber % doubleOfSecondNumber != 0 ){
System.out.printf(  " %d is not a multiple of %d", tripleOfFirstNumber, doubleOfSecondNumber);

}

}
}