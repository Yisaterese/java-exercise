import java.util.Scanner;
public class StudentGradeTest{

	public static void main(String[] args){

		StudentGrade account1 = new StudentGrade("Jumoke", 78.3);
		StudentGrade account2 = new StudentGrade("Abey", 90.2);
		
		System.out.printf("%s's letter graden is: %s%n", account1.getName(),account1.getLetterGrade());

		System.out.printf("%s's letter graden is: %s%n", account2.getName(), account2.getLetterGrade());
	}



}