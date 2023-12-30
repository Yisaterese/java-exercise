import java.util.Arrays;
public class ArrayDemo2{
	public static void main(String[] args){

		int[] myArray = {1,2,3,4,5,};
		int[] newArray = new int[myArray.length];
		int count = 0;
		for(int index = 0; index < myArray.length-1; index+=2){
			newArray[count] = myArray[index];
			count++;
			System.out.print(newArray[count]);
			}

									
	}	

}