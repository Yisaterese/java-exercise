import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenPostionTest{

	@Test
	public void testIfCanPrintOnEvenPosition(){
	EvenPositions evenPositions = new EvenPositions();

	int[] myNewArray = {1,2,3,4,5,6,7,8,9,10};
	int[] methodHolder =  evenPositions.getEvenPositions(myNewArray);
	int[] result = {2,4,6,8,10};
	
	assertArrayEquals(result, methodHolder);
}



}