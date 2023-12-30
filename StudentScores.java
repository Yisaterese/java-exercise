import java.util.Scanner;

public class StudentScores{

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int failScores = 0;
int passScores = 0;


System.out.print("Enter scores or -1 to stop: ");
int scores = scanner.nextInt();	

while (scores != -1){
	if(scores < -1 && scores > 100){
	
       System.out.print("Enter scores or -1 to stop: ");
	scores = scanner.nextInt();
	}
        

       if(scores > -1 && scores < 45){
          failScores ++;
	}
	if(scores <= 100 && scores >= 45){
	passScores ++;	
	}
	
	}	
	
	System.out.println("The number of students that fail are: " + failScores);

	System.out.println("The number of students that pass are: " +passScores);
	

}
}
