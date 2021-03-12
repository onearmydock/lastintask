import java.lang.Integer;
import java.util.Scanner;

class swap{
	
	public static void main(String[] arg){
		int A,B;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number 1 : ");
		A = Integer.parseInt(scan.nextLine());
		System.out.print("enter number 2 : ");
		B = Integer.parseInt(scan.nextLine());
		
		A = A+B;
		B = A-B; //A
		A = A-B; //B
		System.out.println("number 1 : " + A);
		System.out.print("number 2 : " + B);
		
		
	}
}