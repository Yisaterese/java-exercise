public class BikeTest{
public static void main(String[] args){

Bike bike = new Bike();

String colour = bike.setColourOfBike("Black");
String name =bike.setNameOfBike("JinchenG");

bike.getMove();
bike.getStop();

System.out.printf("colour of the bike is %s%n The name of bike is ",colour,name);