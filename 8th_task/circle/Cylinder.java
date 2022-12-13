public class Cylinder extends Circle {

	// create private variables
	private double height;
	
	Cylinder(){};										   	 //The default constructor
	Cylinder(double height){								//Constructor when entering one value
		this.height = height;
	}
	Cylinder(double height, double radius){					//Constructor when entering two values
		super(radius);
		this.height = height;
	}
	Cylinder(double height, double radius, String color){	//Constructor when entering three values
		super(radius, color);
		this.height = height;
	}
	
	void setHeight (double height){							//setter for the variable (radius)
		this.height = height;
	}
	double getHeight(){										//getter for the variable (radius)
		return height;
	}	
	@Override
	public String toString() {						//function that returns the values of the variables in a string form
		return "Cylinder [height=" + height + "]";
	}
	double getVolume(){										//function that returns the volume of the cylinder
		return (getArea()*height);
	}
}
