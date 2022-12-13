public class Shapes {
	//create the variables
	private double radius, length, width;
	//setter functions for the radius, length, and width
	public void setRadius (double r){
		radius = r;
	}
	public void setLength (double l){
		length = l;
	}
	public void setWidth (double w){
		width = w;
	}
	//function to print the area of the circle
	public void getArea_Circle (){
		System.out.println("The area of the circle = "+(3.14*radius*radius));
	}
	//function to print the circumference of the circle
	public void getArea_Circ (){
		System.out.println("The circumference of the circle = "+(3.14*radius*2));
	}
	//function to print the area of the rectangle
	public void getJRec_Area (){
		System.out.println("The area of the rectangle = "+(length*width));
	}
	//function to print the circumference of the rectangle
	public void getJRec_circ (){
		System.out.println("The circumference of the rectangle = "+(2*(length+width)));
	}
}
