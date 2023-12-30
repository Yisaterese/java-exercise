public class AgeTester{

	private static void isAdult(int age){
		int legalAge = 18;
		if(age < legalAge){
			System.out.println("you are not an adult");
		}if(age >= legalAge){
			System.out.print("you are an adult");
		}
	
	}

	public static void main(String[] args){
		 isAdult(18);
		

	}

}