import java.util.Scanner;

public class ValueOfNumbers{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("enter first number");
int value1 = scanner.nextInt();



System.out.println("enter second number");
int value2 = scanner.nextInt();

int square1 = value2 * value1;
int square2 = value1 *value2;


System.out.printf("the value of numbers is %d%n, %d%n", square1, square2 );

}


}

