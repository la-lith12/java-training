package java;
import java.util.Scanner;

class square
{
	public static double sqrt(int a) {
		double temp;
		double str = a/2;
		
		do {
			
			temp = str;
			str =(temp +(a/temp))/2;
			
		}while((temp-str)!=0);
		
		return str;	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number to square:");
		Scanner scanner = new Scanner(System.in);
		int sq = scanner.nextInt();
		scanner.close();
		
		System.out.println("The square of the given value is:" + sq**sq );
		
		
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		System.out.println("Square root of "+ num + " is : " + sqrt(num));
	}
}
