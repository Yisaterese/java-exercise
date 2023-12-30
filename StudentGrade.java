public clas StudentGrade{
private String myName;
private double average;

	public void student(String name, double average ){
	this.myName = name;
		if(average > 0.0){
			if(average <= 100.0){
				this.average = average;
			}
		}
	}
	public void setName(String name){

	this.myName = name;

	}
	public String getName(){

	return myName;
	} 

	public void setAverage(double  studentAverage){
		if(average > 0.0){
			if(average <= 100.0){
				this.average = average;
			}
		}	
	}

	public double getAverage(){
		
	return average;
	}

	public String getLetterGrade(){
		String letterGrade = " ";
		if(average >= 90.0){
			letterGrade = "A";
		}

			else if(average >= 80.0){
				letterGrade = "B";
			}
				else if(average >= 70.0){
					letterGrade = "c";
				}

					else if(average >= 60.0){
						letterGrade = "D";
					}
	
						else if(average >= 50.0){
							letterGrade = "E";
						}
							else{
								letterGrade = "F";

								}
	return letterGrade;

	}




}
