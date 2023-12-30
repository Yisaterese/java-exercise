public class House{

private String address;
private String colour;
private int numberOfRooms;
	
	public House(String address, String colour,int numberOfRooms){
	this.address = address;
	this.colour = colour;
	this.numberOfRooms = numberOfRooms;
	}

	public void setAddress(String myAddress){
	address = myAddress;
	}
	public String getAddress(){
	return address;
	}


	public void setColour(String myColour){
	colour = myColour;
	}
	public String getColour(){
	return colour;
	}


	public void setNumberOfRooms(int myNumberOfRooms){
	numberOfRooms = myNumberOfRooms;
	}
	public int getNumberOfRooms(){
	return numberOfRooms;
	}	
	@Override
	public String toString(){
	return String.format("my address is %s and%nmy house is painted with %s%n i %d number of rooms in my house",getAddress(),getColour(),getNumberOfRooms());
	}
}