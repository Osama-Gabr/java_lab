public class Circle {

	// create private variables
	private double radius;
	private String color;
	
	Circle(){};								//The default constructor
	Circle(double radius){					//Constructor when entering one value
		this.radius = radius;
	}
	Circle(double radius, String color){	//Constructor when entering two values
		this.radius = radius;
		this.color = color;
	}
	
	void setRadius(double radius){			//setter for the variable (radius)
		this.radius = radius;
	}
	double getRadius(){						//getter for the variable (radius)
		return radius;
	}
	
	void setColor(String color){			//setter for the variable (color)
		this.color= color;
	}
	String getColor(){						//getter for the variable (color)
		return color;
	}	
	@Override
	public String toString() {				//function that returns the values of the variables in a string form
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	double getArea(){						//function that returns the area of the circle
		return (3.14*radius*radius);
	}
	
}
