public class HumanTest1{
	public static void main(String[] args){

		House newHouse = new House("No 4 Akawe road Lekki Lagos","Light skyblue and deep green",5);
		Car newCar = new Car("Black","AKD 236 AD","G Wagon","Mecedes",120_000_000);
		
		Human alex = new Human("Olakunle","Adenuga","Dark",6, newCar, newHouse);
		
		System.out.println(alex);


	}

}