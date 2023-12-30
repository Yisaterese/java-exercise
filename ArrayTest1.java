import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayTest1{

	@Test
	public void testArrayInverse(){
	
	 ArrayClass  arrayClass = new  ArrayClass();
	
	double[] numbers = {2,7.8,-4,5,0.8,5};
	double[] inversenum = arrayClass.inverse(numbers);
	
	double[] result = {5,0.8,5,-4,7.8,2};
	assertArrayEquals(result, inversenum);
	}

	@Test
	public void testArrayStringInverse() {
	
	ArrayClass  arrayClass = new  ArrayClass();

	String[] myNames = {"'words","name","jack","victor aramide","dayo"};
	
	String[] methodName = arrayClass.names(myNames);
	String[] result = {"'words","name","jack","victor aramide","dayo"};
	
	assertArrayEquals(result, methodName);
	}

}
