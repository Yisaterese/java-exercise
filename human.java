public class Human{
private String lastName;
private String firstName;
private String complexion;
private int height;
private Car myCar;
private House myHouse;

	

	public Human(String lastName,String firstName,String complexion,int height,Car myCar,House myHouse){
	this.lastName = lastName;
	this.firstName = firstName;
	this.complexion = complexion;
	this.height = height;
	this.myCar = myCar;
	this.myHouse = myHouse;
	}


	public void  SetLastName(String myLastName){
	lastName = myLastName;	
	}
	public String getLastName(){
	return lastName;
	}

	public void  SetFirstName(String myFirstName){
	firstName = myFirstName;	
	}
	public String getFirstName(){
	return firstName;
	}

	public void setHeight(int myHeight){
	height = myHeight;
	}
	public int getHeight(){
	return height;
	}


	public void setComplexion(String myComplexion){
	complexion = myComplexion;
	}
	public String getComplexion(){
	return complexion;
	}
	
	public Car getMyCar(){
	return myCar;
	}

	public House getMyHouse(){
	return myHouse;
	}
	
	@Override
	public String toString(){
	return String.format("%nHi my first name is %s and my last name is %s%n%s in complexion and am %d feet tall.%nBy God's grace i own a car: %s and a house: %s%n",getFirstName(),getLastName(),getComplexion(),getHeight(),getMyCar(),getMyHouse());
	} 
	
}