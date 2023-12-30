import java.util.Arrays;
public class DuplicateInArrays{

	public static void main(String[] args){

	int[] myArray = {6,3,5,9,5,3,9,2,};
	
	for(int i = 0; i < myArray.length-1; i++){

		for(int j = i+1; j<myArray.length-1;j++){
			if(myArray[i] == myArray[j]){


				System.out.println("Duplicate is: "+myArray[i]);
			}

		}
	}

	}

}