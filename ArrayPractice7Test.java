import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
public class ArrayPractice7Test{
	
	@Test
	public void testLargestAndMin(){
		ArrayPracticeClass7 arrayPractice7 = new ArrayPracticeClass7();
		int[] myArray = {87,23,456,87,12,700};
		int result = arrayPractice7.maxMin(myArray);
		assertEquals(700, result);
	}

}
	
