import java.util.Arrays;
public class EvenPositions{

	//public int[] getEvenPositions(int[] even){
public static void main(String[] args){
		int[] myArray = new int[]{1,2,3,4,5,6,7,8,9};

		int[] myNewArray = int[myArray.length]/2;

		int counter = 0;
		for(int index = 0; index < myArray.length; index++){
			//myArray[counter] = myArray[index];
			//counter++;

			if(myArray[index] % 2 == 0){
				myNewArray[counter] = myArray[index];
				counter++;

			}
			
			System.out.print(myNewArray);
		}
			
		//return myArray;
		
	}
}