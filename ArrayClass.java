import java.util.Arrays;
public class ArrayClass{

	public double[] inverse(double[] numbers){
		double[] myArray = new double[numbers.length];
	
		int count = 0;
		for(int index = numbers.length-1; index >= 0; index --){
			myArray[count] = numbers[index];
			count ++;
			
		}
	return myArray;
	
	}


	public String[] names(String[] words){
	
	String[] justNames = new String[words.length];
	justNames [0] = "who";

	return words;
	}
/*public static  void main(String[] args){

	ArrayClass  arrayClass = new  ArrayClass();
		String[] spell = {"spell","is","how"};
		spell [1] = "my";
		String[] printName = arrayClass.names(spell);
		System.out.print(Arrays.toString(printName));

	}
*/
}