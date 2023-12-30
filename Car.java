public class Car{

private String colourOfCar;
private String nameOfCar;
private String model;
private String brand;
private double price;
	
	public Car(String colourOfCar,String nameOfCar,String model, String brand, double price){
	
	this.colourOfCar = colourOfCar;
	this.nameOfCar = nameOfCar;
	this.model = model;
	this.brand = brand;
	this.price = price;
	}
	
	public void setColourOfCar(String colourOfCar){
		this.colourOfCar = colourOfCar;
	}
	public String getColourOfCar(){
		return colourOfCar;
	}

	public void setNameOfCar(String nameOfCar){
		this.nameOfCar = nameOfCar;
	}

	public String getNameOfCar(){
		return nameOfCar;
	}


	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}


	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;

	}


	public void setPrice(double price){
		this.price = price;
	}
	public  double getPrice(){
		return price;
	}

	
	
}