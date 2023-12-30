
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
 
public class RunningTotalTest{

	@Test
	public void testCanReturnTotal(){

	RunningTotal runningTotal = new RunningTotal();

	int[] array = {1,2,3,4,5,6,7,8,9,10};
	int methodHolder = runningTotal.computeRunnigTotal(array);
	int result = 55;
 	
	assertEquals(result, methodHolder);
	}


}

