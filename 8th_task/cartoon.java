import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		Book arr1[] = new Book[3];	//create a reference variable to 3 elements
		child_book arr2[] = new child_book[3];  //create a reference variable to 3 elements
		cartoon arr3[] = new cartoon[3];  //create a reference variable to 3 elements
		//make the 3 elements of the arr1 "Book object"
		arr1[0] = new Book();
		arr1[1] = new Book();
		arr1[2] = new Book();
		//make the 3 elements of the arr2 "child_book object"
		arr2[0] = new child_book();
		arr2[1] = new child_book();
		arr2[2] = new child_book();
		
		//make the 3 elements of the arr3 "cartoon object"
		arr3[0] = new cartoon();
		arr3[1] = new cartoon();
		arr3[2] = new cartoon();
		//set the values of the elements of arr1
		arr1[0].set(100);
		arr1[1].set(200);
		arr1[2].set(300);
		//set the values of the elements of arr2
		arr2[0].set(500);
		arr2[1].set(100);
		arr2[2].set(150);		
		//set the values of the elements of arr3
		arr3[0].set(150);
		arr3[1].set(250);
		arr3[2].set(350);
		
		
		double sum=0;	//make a variable to contain the sum of the prices
		for(int i=0;i<3;i++){	//loop to get the sum of the prices
			sum += arr1[i].get();
		}
		//printing the average of the books
		System.out.println("The average of the books = "+(sum/3));
		
		sum=0;	//make the sum=0 to reuse it
		for(int i=0;i<3;i++){	//loop to get the sum of the prices
			sum += arr2[i].get();
		}
		//printing the average of the children books
		System.out.println("The average of the children books = "+(sum/3));
		
		sum=0;	//make the sum=0 to reuse it
		for(int i=0;i<3;i++){	//loop to get the sum of the prices
			sum += arr3[i].get();
		}
		//printing the average of the children books
		System.out.println("The average of the cartoon books = "+(sum/3));
		
		
	}
}

interface Product {

	//setter for the variable "price"
	void set (double p);
	//getter for the variable "price"
	double get ();
}

class Book implements Product{

	//create the variables
	double price;
	String category;
	//overriding the getter function in the abstract
	@Override
	public double get (){
		return price*.5 ;
	}
	@Override
	public void set (double p){
		price = p;
	}
}

class child_book extends Book {
	
	//overriding the getter function in the Book class
	@Override
	public double get (){
		return price*.3 ;
	}
}

class cartoon extends Book {
	
	//overriding the getter function in the Book class
	@Override
	public double get (){
		return price*.8 ;
	}
}
