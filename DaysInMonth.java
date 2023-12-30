import java.util.Scanner;

public class DaysInMonth{

public static void main(String[] args){

Scanner input = new Scanner(System.in); 
System.out.print("enter month ");
int month = input.nextInt();
 
System.out.print("enter year ");
int year = input.nextInt();

if(month == 1){
System.out.printf("janury %d is 31 days",year);
}

if(month == 2){
if (year %4 == 0 )
System.out.printf("february  %d is 29 days",year);
if(month == 2)
if(year %4 != 0)
System.out.printf("february %d is 28 days",year);
}

if(month == 3){
System.out.printf("march %d is 31 days",year);
}


if(month == 4){
System.out.printf("april %d is 30 days",year);
}

if(month == 5){
System.out.printf("may %d is 31 days",year);
}

if(month == 6){
System.out.printf("june %d is 30 days",year);
}

if(month == 7){
System.out.printf("july %d is 31 days",year);
}

if(month == 8){
System.out.printf("august %d is 31 days",year);
}

if(month == 9){
System.out.printf("september %d is 30 days",year);
}

if(month == 10){
System.out.printf("october %d is 31 days",year);
}

if(month == 11){
System.out.printf("november %d is 30 days",year);
}

if(month == 12){
System.out.printf("december %d is 31 days",year);

}




}




}






















