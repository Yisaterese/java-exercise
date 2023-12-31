public class Car{

private String colourOfCar;
private String plateNumber;
private String model;
private String brand;
private double price;
	
	public Car(String colourOfCar,String plateNumber,String model, String brand, double price){
	
	this.colourOfCar = colourOfCar;
	this.plateNumber = plateNumber;
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

	public void setPlateNumber(String plateNumber){
		this.plateNumber = plateNumber;
	}

	public String getPlateNumber(){
		return plateNumber;
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
	
	@Override
	public String toString(){
	return String.format("my car colour is %s%nplate number is %s%nmodel is %s%nbrand is %s and%nthe price is %.2f%n",getColourOfCar(),getPlateNumber(), getModel(),getBrand(),getPrice());
	}
	
	
}