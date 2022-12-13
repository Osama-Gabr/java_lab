import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {		
		
		Cylinder x = new Cylinder(2,2,"Green");							  //create an object from the class"cylinder"
		System.out.println("The area of the circle = "+x.getArea());	  //print the area of the circle(cylinder's base)
		System.out.println("The volume of the cylinder = "+x.getVolume());//print the volume of the cylinder
		
	}

}