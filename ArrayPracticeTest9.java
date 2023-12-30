import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayPracticeTest9{


	@Test
	public void testIfCanGetElementsOnEvenPositions(){
	
	ArrayPracticeClass9 arrayPracticeClass9
= new ArrayPracticeClass9();
	
	int[] myArray = {1,2,3,4,5,6,7,8,9,10};
	int[] holdMethod = arrayPracticeClass9.evenNumbers(myArray);
	int[] expectedResult = {2,4,6,8,10};
	assertArrayEquals(holdMethod, expectedResult);
	}
}