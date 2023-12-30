import java.util.Arrays;
public class ArrayOddPositions{

	public static void main(String [] args){

	int[] myArray = {3,5,7,8,2,98};
	

	for(int index = 0; index <= myArray.length-1; index+=2){
		
		
		System.out.print(myArray[index]+" ");
	}
	}



}