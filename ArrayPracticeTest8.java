import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
public class ArrayPracticeTest8{
	

	@Test
	public void testCanGetMinimum(){
		ArrayPracticeClass8 arrayPracticeClass8 = new ArrayPracticeClass8();
		
		double[] myArray = {1.45,-567,23,-78,0.67};

		
	 	double minValue = arrayPracticeClass8.minimum(myArray);
		double result = -567;
		assertEquals(result, minValue);

	}
}