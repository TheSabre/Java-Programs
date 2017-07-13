import java.util.Scanner;

public class Even_Odd {
	private static Scanner scan;

	public static void main(String args[]){
		scan = new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number to find if it is even or odd");
		
		n = scan.nextInt();
		
		if((n%2)==0){
			System.out.println("Hi! The number "+ n + " is an even number.");
		}
		else
			System.out.println("The number "+ n + "is an odd");
	}
}
