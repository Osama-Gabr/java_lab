import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {		
		//ask the user to enter the string then create a variable to store the string
		System.out.println("Enter the string you want to remove ',' from:");
		String s = input.nextLine();
		/*use the built in function "replace" to remove "," 
		  then store the string after removing in the same variable*/
		s = s.replace(",", "");
		//print the string after removing ","
		System.out.println(s);

	}

}