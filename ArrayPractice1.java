
import java.util.Arrays;
public class ArrayPractice2{
	public static void main(String[] args){

		int[] num = {9,45,23,55,67,7,8,23,29,12};
		System.out.printf("Grade distribution" );
		for(int counter = 0; counter < num.length; counter++){
			if(counter == 0){
				System.out.print("%5d: ",67);
				}
			elase{
				System.out.print("%02d-%02d: ");								counter * 10, counter * 10 +8 
				}
			for(int stars = 0; stars < num[counter];stars++){
				System.out.print("*");
				}
			System.out.printf();
		}
	}
}

