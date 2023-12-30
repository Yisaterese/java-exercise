public class ArrayPracticeClass9{

	public int[] evenNumbers(int[] even){
		
		int[] array = new int[even.length];
		
		for(int index = 1; index < even.length-1; index+=2){
			array = even[index];
	
			System.out.print(array);
		}
		
	return array;
	}
}