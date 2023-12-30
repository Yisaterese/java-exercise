import java.util.Arrays;
public class inverseArray{


	public static void main(String[] args){
	int [] myArray = {45,23,78,90,12,78};
//	myArray[0] = 45;
//	myArray[1] = 23;
//	myArray[2] = 78;
//	myArray[3] = 90;
//	myArray[4] = 12;
//	myArray[5] = 78; 
	int inverse = 0;
	for(int i = myArray.length-1; i >= 0; i--){
		myArray[i] = inverse;
		inverse--;
//		System.out.print(Arrays.toString(myArray[i]));
	System.out.print(Arrays.toString(myArray));
	}
	}
}