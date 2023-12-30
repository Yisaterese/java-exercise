public class ArrayPracticeClass8{

	public double minimum(double[] min){
		
		double smallest = min[0];
		for(int index = 0; index < min.length-1; index++){
			if(min[index] < smallest){
				smallest = min[index];
			}
		}
	return smallest;

	}
}

	