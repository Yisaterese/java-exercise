import java.util.Scanner;
public class BmiCalculator{
	public static void main(String[] args){

		Scanner scanner = new Scanner (System.in);

		System.out.print("Enter your weight: ");
		double weight = scanner.nextDouble();

		System.out.print("Enter your height: ");
		double height = scanner.nextDouble();
		
		double BMIResult = weight / (height * height);	
		System.out.println("Your BMI is: " +BMIResult);

		System.out.printf("""
				Category	BMI
				>>>>>>>>>>>>>>>>>>>>>>>>>>>>> 
				Under weight    Below 18.5
				Over weight  	25  t0 24.9
				Healthy weight 	18.5 t0 24.9
				Obese		30 0r above""");					
	}

}