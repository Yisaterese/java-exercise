public class RunningTotal{

	public int computeRunnigTotal( int[] computeTotal){

		int[] myArray = computeTotal;
		int total = 0;
	
		for(int index = 0; index <= myArray.length-1; index++){
			
			total += myArray[index];
			
				
			
		}
	
	return total;
	} 
}