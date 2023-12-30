import java.util.Scanner;
public class Square{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please enter number1");
int number1 = scanner.nextInt();
System.out.println("please enter number2");
int number2 = scanner.nextInt();
int square1=number1*number1;
int square2=number2*number2;
int sumOfSquare=square1+square2;
int differenceOfSquare=square1-square2;
System.out.printf("square1 is %d%n, square2 %d%n, sumOfSquares %d%n differenceOfSquare is %d%n", square1, square2, sumOfSquare,differenceOfSquare);

}



}