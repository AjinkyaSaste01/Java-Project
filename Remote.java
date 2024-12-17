//Create a class called remote controll

class Remote{
	String company;
	String type;
	String colour;
	int buttons;
	//Setter Method
	public void setCompany(String c){
		company=c;
	}
	
	public void setType(String t){
		type=t;
	}
	
	public void setColour(String a){
		colour=a;
	}
	
	public void setButtons(int b){
		buttons=b;
	}
	
	//getter method
	
	public String getCompany(){
		return company;
	}
	
	public String getType(){
		return type;
	}
	
	public String getColour(){
		return colour;
	}
	
	public int getButtons(){
		return buttons;
       	}
	
	public static void main(String [] args){
		Remote r1=new Remote();
		r1.setCompany("LG");
		r1.setType("T.V");
		r1.setColour("Black");
		r1.setButtons(30);
	}

 }


// 'this' is a keyword in java
// 'this' is a built in reference to current object.
// 'this' is always used to access the current object.
// if the name of instance variable and local variable is same then we must use the reference 'this' to access current object.
// if the name of instance variable and local variable is same it is called as shadowing of instance field.
// 






