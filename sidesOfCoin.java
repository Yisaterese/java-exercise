import java.util.Scanner;


public class HeadAndTail{

public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("enter a guess 0 or 1, head or tail:  ");
int guess = input.nextInt();
int coinsides1 = 1;
int coinSides2 = 0;

if(guess == 0){
System.out.print("guess is correct");
}
if(guess != 0){
System.out.print("guess is incorrect");
}
if(guess == 1){
System.out.print("guess is correct");
}
if(guess != 1){
System.out.print("guess is incorrect");
}
}

}