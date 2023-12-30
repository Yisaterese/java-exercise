import java.util.Scanner;

public class CostOfDriving {
public static void main(String[] args){
Scanner input  = new Scanner(System.in);

System.out.print("enter distance");
double number1 = input.nextDouble();

System.out.print("enter fuel efficiency per miles");
double number2 = input.nextDouble();

System.out.print("enter price per gallon");
double number3 = input.nextDouble();

double costOfTrip = (number1/number2) * number3;

System.out.printf("CostOfDriving is %f%n ", costOfTrip);



}





}