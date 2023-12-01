import java.util.Scanner;

public class PositiveAndNegative{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

double average;
int positive = 0;
int negative = 0;
double total = 0;
int count = 0;

System.out.print("Enter numbers or 0 to stop: ");
int number1 = input.nextInt();

while (number1 != 0){
     if(number1 >= 1){
         positive +=1;
         }
       if(number1 <= -1){
         negative +=1;
         }
      count +=1;
      total += number1;
System.out.print("Enter numbers or 0 to stop: ");
number1 = input.nextInt();
   
}
     average = total / count;
System.out.println("the number of positive is: " +positive); 
System.out.println("The number of negative is: " +negative); 
System.out.println("The average of number is: " +average); 
System.out.print("The total number is: " +total);   
}
}