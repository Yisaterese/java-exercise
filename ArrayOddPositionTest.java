import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class ArrayOddPositionTest{

	@Test
	public void testCanReturnValueAtOddPosition(){ 
		ArrayAtOddPosition newMyArray = new ArrayAtOddPosition();

		String[] myNewArray = {"Chichi","Ayo","Kadoon","Abe","Isco","Fred","Boss"};
		
		String[] methodHolder = newMyArray.methodOddPositions(myNewArray);
		String[] result = {"Chichi","Kadoon","Isco","Boss"};
		
		assertArrayEquals(result, methodHolder );
	}
	
	@Test
	public void canPrintIntegersAtOddPositions(){
	ArrayAtOddPosition printInt = new ArrayAtOddPosition();
	
	int[] myArray = {3,5,2,1,6,7,8,67};
	
	int[] myMethodHolder = printInt.atOddPositions(myArray);
	int[] newResult = {3,2,6,8};
	
	assertArrayEquals(newResult,myMethodHolder);

	}
	@Test
	public void canReturnDoubleAtOddPositions(){
	ArrayAtOddPosition objectArray = new ArrayAtOddPosition();
	
	double[] newMyArray = {4.2,45,6.7,55.0,23.00,};
	double[] methodHolder = objectArray.canGetOddPositions(newMyArray);
	
	double[] result = {4.2,6.7,23.00};
	assertArrayEquals(result, methodHolder);
	}












}