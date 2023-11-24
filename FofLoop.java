import java.util.Scanner;
 
public class FofLoop{

public static void main(String[] args){

for(int num = 1; num <= 10; num++){
	System.out.printf("%d%n ", num);
}


System.out.println("Enter any number or control ctrl Z to stop ");
Scanner scanner = new Scanner(System.in);


int sum = 0;
int count = 0;

while(scanner.hasNext()){
int scores = scanner.nextInt();
sum += scores;
count++; 
}

System.out.printf("The sum of the scores is %d%n ",sum);


double averageOfNumbers = sum/count;

System.out.printf("Average of numbers is %f%n ", averageOfNumbers);
}
}
