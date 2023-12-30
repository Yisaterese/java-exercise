import java.util.Arrays;
public class ArrayPractice6{
	public static void main(String[] args){
	int[] myArray = new int[]{10,20,30,40,0,60,70};
	//int[] inverse = new int[myArray.length];
	//int inverse = 1; 
	for(int counter = 0; counter <=  myArray.length-1;	; counter++){
		 myArray[counter] = myArray++;			
		
	}
	System.out.print(Arrays.toString(myArray));
	}
}