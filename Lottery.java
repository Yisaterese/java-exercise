import java.util.Scanner;
import java.security.SecureRandom;

 public class Lottery{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

SecureRandom random = new SecureRandom();
int number = random.nextInt(1,11);

System.out.print("Enter a guess: ");
int guess  = scanner.nextInt();

if(guess < number){
	System.out.printf("Too low: random number = %d%n Your guess = %d ", number, 	guess);
	}
  	if(guess == number){
	System.out.printf("Correct: random number = %d%n Your guess = %d", number, 	guess);
	}
  
	if(guess > number){
	
	System.out.printf("Too high: random number = %d%n your guess = %d", 	number, guess);
	}

	if(guess < 1 || guess > 11){
	System.out.printf(" %nInvalid guess,try again");
	}
}

}