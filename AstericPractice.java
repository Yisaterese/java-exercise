public class AstericPractice{

	public static void main(String[] args){


	for(int row = 1; row <= 5; row++){
		for(int col = 5; col >= row; col--){
			System.out.print("*");
		}

		System.out.println();
	}
	

	for(int row = 1; row <= 5; row++){
		for(int col = 1; col <= row; col++){
			System.out.print("* ");
		}

		System.out.println();
	}

	for(int row = 1; row <= 5; row++){
		for(int col = 1; col <= row; col++){
			System.out.print(col+" ");
		}

		System.out.println();
	}
	
	System.out.println();
	for(int row = 1; row <= 5; row++){
		for(int col = 5; col >= row; col--){
			System.out.print(col+" ");
		}

		System.out.println();
	}

	System.out.println();
	for(int row = 1; row <= 5; row++){
		for(int col = 5; col >= row; col--){
			System.out.print(col+" ");
		}

		System.out.println();
	}
	System.out.println();

	for(int row = 1; row < 2 * 5; row++){
		int totalColsInRow = row > 5? 2 * 5 - row: row;
		for(int col = 0; col < totalColsInRow; col++){
			System.out.print(row+" ");
		}

		System.out.println();
	}
	System.out.println();

	for(int row = 1; row < 2 * 5; row++){
		int totalColsInRow = row > 5? 2 * 5 - row: row;
		int noOfSpaces = 5 - totalColsInRow ;
		for(int col = 0; col < noOfSpaces; col++){
			System.out.print(" ");
		}
		for(int col = 0; col < totalColsInRow; col++){
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();

	for(int row = 1; row <=  5; row++){
		for(int spaces = 0; spaces < 5- row; spaces++){
			System.out.print("  ");
		}
		//int totalColsInRow = row > 5? 2 * 5 - row: row;	
		for(int col = row; col >= 1; col--){
			System.out.print(col+ " ");
		}
		for(int col = 2; col <=  row; col++){
			System.out.print(col+ " ");
		}
	System.out.println( );	
	}


}
}