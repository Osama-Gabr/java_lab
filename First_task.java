import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//create variables
	    char c;
	    int x;
	    //ask the user to enter the integer then receive the number from him
		System.out.println("Enter the integer you want to get the character for:");	    
	    x= scan.nextInt();
	    //doing type casting to get the ASCII character of the integer
	    c= (char) x;
	    //print the ASCII character of the integer
	    System.out.println(c);
	}	    
}