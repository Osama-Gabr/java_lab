import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {		
		double r, l, w;//create the variables
		Shapes shape = new Shapes();//create an object from the shapes class
		//ask the user to enter the values of the variables
		System.out.println("Enter the radius, length, and width:");
		//Receive the entered values from the user
		r = input.nextDouble();
		l = input.nextDouble();
		w = input.nextDouble();
		//setting the variables of the object using the entered values
		shape.setRadius(r);
		shape.setLength(l);
		shape.setWidth(w);
		//calling functions to print the area and circumference of the circle
		shape.getArea_Circ();
		shape.getArea_Circle();
		//calling functions to print the area and circumference of the rectangle
		shape.getJRec_circ();
		shape.getJRec_Area();

	}

}
