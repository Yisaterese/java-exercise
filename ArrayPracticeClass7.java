public class ArrayPracticeClass7{
	public static int maxMin(int[] myArray){
//		int[] myArray = new int[5];
		int largest = 0;
		for(int i = 0; i < myArray.length-1;i++){
			if(myArray[i] > largest){
			largest = myArray[i];
			
			} 
		}
		return largest;
	}
}