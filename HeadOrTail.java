import java.util.Scanner;
import java.util.Random;

public class HeadOrTail{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
Random random = new Random();

System.out.print("please enter a guess 1 or 0 for head or tail  ");
int guess = input.nextInt();

int randomNumber = random.nextInt(2);


if(guess == 0 || guess == 1 ){
System.out.print("the correct number is: "+randomNumber);
}

if(guess == randomNumber){
System.out.print(" you are correct");
}

if(guess != randomNumber){
  System.out.print(" incorrect try again");
}

}

}