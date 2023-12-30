public class Clock{
private int hour;
private int minute; 
private int seconds;
	
	public Clock(int hour, int minute, int seconds){
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	} 

	public void setHour(int hour){
		if(hour > 23){
			hour = 0;
		}
	this.hour = hour;
	} 
	
	public int getHour(){
	return hour;
	}
	
	public void setMinute(int minute ){
		if(minute > 59){
			minute = 0;
		}
	this.minute = minute;
	}

	public int getMinute(){
	return minute;
	}

	public void setSeconds(){
		if(seconds > 59){
			seconds = 0;
		}
	this.seconds = seconds;
	}
	
	public int getSeconds(){

	return seconds;
	
	public String displayTime(){
		String timeDisplay = ("The time is " + hour + ":" + minute + ":" + seconds);
	return timeDisplay;
	}
 	
}