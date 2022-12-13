import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//ask the user to enter two numbers then receive them from him
		System.out.println("Enter n then r");
		int n= scan.nextInt();
		int r= scan.nextInt();
		//apply the law of nCr then store the result in variable(c)
		long c = factor(n)/(factor(r)*factor(n-r));
		//apply the law of nPr then store the result in variable(p)
		long p = factor(n)/(factor(n-r));
		//print the result of nCr then nPr
		System.out.println("nCr = "+c);
		System.out.println("nPr = "+p);
	}
	//function that take a number then returns the factor of it
	public static long factor(int n){
		long sum=1;
		for(;n>0;n--)
			sum = sum*n;
		return sum;
	}
}