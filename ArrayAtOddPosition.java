import java.util.Arrays;
public class ArrayAtOddPosition{

	public  String[] methodOddPositions(String[] names){
		int newArrayLength = 0;
		
		if(names.length % 2 != 0){
			newArrayLength = (names.length/2)+1;
		}else{
			newArrayLength = names.length/2;
		}
		String[] newArray = new String[newArrayLength];
		int counter = 0;	
		
		for(int index = 0; index < names.length; index+=2){
			if(index % 2 == 0){
				newArray[counter] = names[index];
				counter++;

			}
			//System.out.println(myArray[index]);						
		}
	
	return newArray;
	}
	
	public static int[] atOddPositions(int[] odd){
	int oddPosition = 0;
	if(odd.length % 2 != 0){
		oddPosition = (odd.length/2)+1;
	}else {
		oddPosition = odd.length/2;
	}
	int[] array = new int[oddPosition];
	int newcounter = 0;
	
	for(int i = 0; i < odd.length; i+=2){
		if(i % 2 == 0){
		array[newcounter] = odd[i];
		 newcounter++;
		}

	}

	return array;
	}

	public double[] canGetOddPositions(double[] oddPosition){
	int arrayLength = 0;

	if(oddPosition.length % 2 != 2){
		arrayLength = (oddPosition.length/2)+1;
	}else{
		arrayLength = oddPosition.length/2;
	}
	double[] mynewArray = new double[arrayLength];
	int counter = 0;
	
	for(int index = 0; index < oddPosition.length; index+=2){
		if(index % 2 == 0){
			mynewArray[counter] = oddPosition[index];
			counter++;
		}

	}
	return mynewArray;
	}


	
}
