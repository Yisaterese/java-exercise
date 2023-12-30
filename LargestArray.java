public class LargestArray{

	public static void main(String[] args){

	int[] myArray = {2,3,6,22,8};
	int largest = 0;
	for(int i = 0; i <= myArray.length-1; i++){
		if(myArray[i] > largest){
			largest = myArray[i];
		}
	
	}
	System.out.print(largest);
	}	


}