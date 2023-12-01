import java.util.Scanner;

public class DayOfTheWeek {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("enter the  year "); 
int year = input.nextInt();
System.out.print("enter the  month "); 
int month = input.nextInt();
System.out.print("enter day of the month"); 
int week = input.nextInt();

System.out.print("enter day of the week "); 
int week = input.nextInt();


int dayOfMonth = day(month + 1)/10;
int yearOfCentury = yearOfCentury + (yearOfCentury / 4);
int century1 = century1 / 4; 
int century2 = 5 * century2; 
int dayOfWeek = (dayOfMonth + yearOfCentury + century1 + century2)%7;

if(dayOfWeek == 1){
System.out.print("the day of the week is sunday");
}
if(dayOfWeek == 2){
System.out.print("the day of the week is mondayday");
}

if(dayOfWeek == 3){
System.out.print("the day of the week is tuesday");
}

if(dayOfWeek == 4){
System.out.print("the day of the week is wednesday");
}

if(dayOfWeek == 5){
System.out.print("the day of the week is thursday");
}

if(dayOfWeek == 6){
System.out.print("the day of the week is friday");
}

if(dayOfWeek == 7){
System.out.print("the day of the week is saturday");
}





}
}