public class HumanTest1{
	public static void main(String[] args){

		
		Car newCar = new Car("Black","AKD 236 AD","G Wagon","Mecedes",120_000_000);
		House newHouse = new House("No 4 Akawe road Lekki Lagos","Light skyblue and deep green",5);
		Human alex = new Human("Olakunle","Adenuga","Dark",6,newCar,newHouse);

		System.out.println(alex);

		/*System.out.println("Your last name is: "+alex.getLastName());
		System.out.println("Your first name is: " +alex.getFirstName());
		System.out.println("Your complexion is: " +alex.getComplexion());
		System.out.printf("Your height is: %d%n",alex.getHeight());

		System.out.println();

		System.out.println("Your house Address is: "+myHouse.getAddress());
		System.out.println("Your house colour is: "+myHouse.getColour());
		System.out.printf("Your house's number of rooms  are: %d%n",myHouse.getNumberOfRooms());

		System.out.println();

		System.out.println("Your car's colour is: "+myCar.getColourOfCar());
		System.out.println("Your car's plate number is: "+myCar.getPlateNumber());
		System.out.println("Your car's model is: "+myCar.getModel());
		System.out.println("Your car's brand is: "+myCar.getBrand());
		System.out.printf("Your car's price is: %.2f",myCar.getPrice());*/



	}

}