import java.util.Scanner;

public class NumberOfIntegers{
public static void main(String[] args){


Scanner input = new Scanner(System.in);

System.out.println("Enter numbers or Ctrl Z  to stop");

int negativeCount = 0;
int zeroCount = 0;
int positiveCount = 0;


while(input.hasNext()){
System.out.println("Enter numbers or Ctrl Z  to stop");
int number = input.nextInt();
	if(number < 0){
	negativeCount--;	
	}

	else if(number > 0){
	positiveCount--;
	}

	else if (number == 0){
	zeroCount--;
	}
}

System.out.printf("Number of negative count is %d%n Number of positve count is %d%n Number of zero count is %d%n ", negativeCount,positiveCount,zeroCount);
}
}