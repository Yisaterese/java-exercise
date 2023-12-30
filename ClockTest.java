public class ClockTest{

	public static void main(String[] args){

		Clock clock = new Clock(11,56,23);
		
		System.out.printf("The time is: %d:%d:%d", clock.getHour(),clock.getMinute(),clock.getSeconds());
	
		System.out.print(clock.dispalyTime());
		
	}
}