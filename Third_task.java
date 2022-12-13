import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask the user to enter the size of the array then receive the size
		System.out.println("enter the size of the array");
		int size = input.nextInt();
		//make an array with the size entered by the user
		int[] arr = new int[size];
		//ask the user to enter the array elements
		System.out.println("enter the elements of the array");
		//use for loop to receive the array elements
		for(int i=0;i<size;i++)
			arr[i]=input.nextInt();
		//make a variable to store the max number
		int max=arr[0];		
		//use for loop to find the max and store it in the variable(max)
		for(int i=1;i<size;i++){
			if(arr[i] > max)
				max = arr[i];
		}
		//print the maximum number in the array
		System.out.println("the largest number = " + max);
	}
}