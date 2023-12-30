import java.util.Arrays;
public class ArrayPractice7{
	public static void main(String[] args){

	int[] myArray ={200,34,45,70,100,50};
	int largest = 0;
	int min = myArray[0];
	for(int i = 0; i < myArray.length; i++){
		if(myArray[i] > largest){
			largest = myArray[i];
		}
	
	 	if(myArray[i] < min){
			min = myArray[i];
		}
	}
	System.out.println("minimum is: " + min);	 
	System.out.println("largest is: " + largest);	
} 
}