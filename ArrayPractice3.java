import java.security.SecureRandom;


public class ArrayPractice3{
	public static void main(String[] args){
		SecureRandom randomNumbers = new SecureRandom();

		int[] frequency = new int[7];
		System.out.printf("Grade distribution%n" );
		for(int roll = 1; roll <= 60_000_000; roll++){
			++frequency[1+ randomNumbers.nextInt(6)];
			}

		System.out.printf("%s%10%n", "Face", "Frequency");
		for(int face = 1; face <= frequency.length;face++){
			System.out.printf("%4d%10%n", face, frequency[face]);
		}
	} 
	
}