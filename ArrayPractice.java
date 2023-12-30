import java.util.Arrays;
public class ArrayPractice{
	public static void main(String[] args){

		int[] num = new int[5];
		System.out.printf("%4s%4s%n", "Index", "Value" );
		for(int counter = 0; counter < num.length; counter++){
			System.out.printf("%4d%4d%n",counter,num[counter]);
		}
	}
}