import java.util.Scanner;
public class Pair{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please enter number1");
int number1 = scanner.nextInt();
int square= number1*number1;

if(number1 > 100 && square > 100)
System.out.printf("%d && %d%n > 100", number1,square);

if(number1==100 && square == 100)
System.out.printf("%d && %d%n == 100", number1,square);

if(number1 != 100 && square != 100)
System.out.printf("%d && %d%n != 100", number1,square);

if(number1 < 100 && square < 100)
System.out.printf("%d && %d%n < 100", number1,square);

}




}