public class ArrayPractice10{
	public static void main(String [] args){
		//public int sumOfArray(int[] sum){

		int[] myArray = {3,4,5,-5,0,12};
		int[] sumCounter = 0;
		
		for(int index = 0; index <= myArray.length-1; index++){
			myArray += index;
			
			System.out.print(myArray);
		}

		//}


	}
}