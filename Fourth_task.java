import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ask the user to enter the dimension of the array
		System.out.println("enter the row number then the column number");
		//receive and store the two numbers entered by the user
		int row=input.nextInt();
		int column=input.nextInt();
		//create a 2d array with the size entered
		int[][] arr = new int[row][column];
		//use a loop to set the elements of the 2d array
		for(int i=0;i<row;i++){
			System.out.println("enter the elements of the "+ (i+1) + " row");
			for(int j=0;j<column;j++){
				arr[i][j]=input.nextInt();
			}
		}
		
		System.out.println("the transpose of a the array is");
		//print the the transpose of a the array by printing the columns then rows 
		for(int j=0;j<column;j++){
			System.out.println(" ");
			for(int i=0;i<row;i++){
				System.out.print(arr[i][j] + " ");
			}
		}
	}
}