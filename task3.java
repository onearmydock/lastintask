 import java.lang.Integer;
import java.util.Scanner;
 
class prime{
	public static void main(String[] arg){
		int A,tag=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number 1 : ");
		A = Integer.parseInt(scan.nextLine());
		
		if(A == 1 || A ==0){
			System.out.println("number is not prime");
		}
		else{
			for(int i=2;i<A/2;i++){
				if(A%i ==0){
					tag = 1;
				}
			}
		}
		if(tag ==1){
			System.out.println("number is not prime");
		}
		else{
			System.out.println("number is prime");
		}
		
		
	}
}