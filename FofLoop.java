import java.util.Scanner;
 
public class FofLoop{

public static void main(String[] args){

<<<<<<< HEAD
for(int num = 0; num < 10; num++){
	System.out.printf("%d%n", num);
=======
for(int num = 1; num <= 10; num++){
	System.out.printf("%d%n ", num);
>>>>>>> c9885402822631f2168090bc12b2a94c0d6ec468
}


System.out.println("Enter any number or control ctrl Z to stop ");
Scanner scanner = new Scanner(System.in);


int sum = 0;
int count = 0;

while(scanner.hasNext()){
int scores = scanner.nextInt();
<<<<<<< HEAD
sum = sum + scores;
=======
sum += scores;
>>>>>>> c9885402822631f2168090bc12b2a94c0d6ec468
count++; 
}

System.out.printf("The sum of the scores is %d%n ",sum);


double averageOfNumbers = sum/count;

System.out.printf("Average of numbers is %f%n ", averageOfNumbers);
}
}
