public class CarTest{
	public static void main(String[] args){

		Car car1 = new Car();
		Car car2 = new Car();

		car1.setColourOfCar("white");
  		car2.setColourOfCar("Blue"); 

		car1.setNameOfCar("Mercedes");
		car2.setNameOfCar("Audi");

		car1.setModel("G.Wagon");
		car2.setModel("Expendable");
		
		car1.setPrice(20_000_000);
		car2.setPrice(15_000_000);
		
		car1.setYear("2023");
		car2.setYear("2022");

		
		
		System.out.println("Car1 colour is: "+car1.getColourOfCar());
		System.out.println("Car2 colour is: "+car2.getColourOfCar());

		System.out.println();

		System.out.println("Car1 name is: "+car1.getNameOfCar());
		System.out.println("Car2 name is: "+car2.getNameOfCar());

		System.out.println();
		
		System.out.println("Car1 model is: "+car1.getModel());
		System.out.println("Car2 model is: "+car2.getModel());

		System.out.println();

		System.out.printf("Car1 price is: %.2f%n",car1.getPrice());
		System.out.printf("Car2 price is: %.2f%n",car2.getPrice());

		System.out.println();

		System.out.println("Car1 year is: "+car1.getYear());
		System.out.println("Car2 year is: "+car2.getYear());

		System.out.println();
		
		double car1Price = 20_000_000;
		double car2Price = 15_000_000;

		double discount1 = car1Price * (5.0/100);
		double car1DiscountedPrice = car1Price - discount1;

		double discount2 = car2Price * (7.0/100);
		double car2DiscountedPrice = car2Price - discount2;

		
		System.out.printf("Car1 discounted price is: %.2f%n",car1DiscountedPrice);

		System.out.printf("Car2 discounted price is: %.2f",car2DiscountedPrice);







	}
}