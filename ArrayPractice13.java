public class ArrayPractice13{

	public static void main(String[] args){
		
		String[] myArray = {"James","Nadia","Sophia","alex"};
		for(int index = myArray.length-1; index >= 0; index--){
			
			System.out.println(myArray[index]);
				
		}

		System.out.println();

		String[] myNewArray = {"James","Nadia","Sophia","alex"};
		for(String index:myNewArray){
			System.out.println(index);
		}

	}

}