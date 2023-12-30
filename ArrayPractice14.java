public class ArrayPractice14{

	public static void main(String[] args){

	String[] myArray = new String[]{"Ali", "mojo", "sultan", "alice"};

	for(String names : myArray){

		if(names.endsWith("o")){;
		continue;
		}
		System.out.println(names);
		
	}	
	}


}