import java.util.Scanner;
public class Divisible{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please enter number");
int number = scanner.nextInt();

if(number % 3 == 0){
System.out.print("number is devisible");
}

if(number % 3 != 0){
System.out.print("number not devisible");
}


}
}