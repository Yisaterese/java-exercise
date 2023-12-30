import java.util.Scanner;

public class FeetInToMeters{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("please enter number");
double number = scanner.nextDouble();
double feet = 0.305;
double conversion = (number*0.305);

System.out.printf("conversion of feet into meters is %f%n", conversion);

}




}