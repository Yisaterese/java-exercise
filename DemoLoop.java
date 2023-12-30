
import java.util.Arrays;

public class DemoLoop{
public static void main(String[] args){

int [] number = new int[100];
int [] newNumber = new int [number.length];

for(int count = 100-1, j = 0; count >= 0; j++, count--){

	newNumber[j] = count;

}
System.out.print(Arrays.toString(newNumber));
}
}
	

	