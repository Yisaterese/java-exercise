import java.util. Scanner;

public class HighestScore{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int count =0;
int highestScore = 0;
String highestScorerName   = "  ";
int numberOfStundents = 0;
int score = 0;

System.out.print("Enter number of students: ");
numberOfStundents = scanner.nextInt(); 

for(count=0; count< numberOfStundents;count++){
	System.out.printf("Enter name of student%d: ",(count+1));
	String nameOfStudent = scanner.next();

 	System.out.printf("Enter score of students%d: ",(count+1));
	score = scanner.nextInt();

	if(score > highestScore){
	  highestScore = score;
	 highestScorerName = nameOfStudent;
	
	}
	}
System.out.printf("The highest score is: %d%nThe higest scorer's name is: %s",  score, highestScorerName);
}
}