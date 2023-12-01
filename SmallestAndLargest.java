import java.util.Scanner;

public class SmallestAndLargest{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
System.out.print("please enter first numbers");
int number1 = input.nextInt();

System.out.print("please enter second numbers");
int number2 = input.nextInt();

System.out.print("please enter third numbers");
int number3 = input.nextInt();

System.out.print("please enter fourth numbers");
int number4 = input.nextInt();

System.out.print("please enter fifth numbers");
int number5 = input.nextInt();


if(number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5){
System.out.println( +number1 "is maximum");

if(number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
System.out.println("number1 is minimum" +number1);
}


}
}