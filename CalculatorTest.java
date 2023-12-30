import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest{
	@Test
	public void TestTthatCalculatorCanAndTwoPositiveNumbers(){

		Calculator calculator = new Calculator();
		int sum = calculator.add(4,2);
		assertEquals(6,sum);

}
	@Test
	public void TestTthatCalculatorCanAndTwoNegativeNumbers(){
	Calculator calculator = new Calculator();
	int sum = calculator.add(-3, -2);
	assertEquals(-5, sum);
}
	@Test
	public void TestTthatCalculatorCanAndTwoProductOfNumbers(){
	Calculator calculator = new Calculator();
	int sum = calculator.product(5,2);
	assertEquals(10,sum);
}
	@Test
	public void Testsqrt(){
	Calculator calculator = new Calculator();
	int square = calculator.sqrt(3);
	System.out.print(square);
	assertEquals(9, square);
}

	/*@Test
	public void Testpow(){
	Calculator calculator = new Calculator();
	int square = calculator.sqrt(3);
	System.out.print(square);
	assertEquals(9, square);*/
}	

}