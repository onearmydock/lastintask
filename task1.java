import java.util.Scanner;
class Stringreverse{
	public static void main(String arg[])
	{
	String s;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter string : ");
	s=scan.nextLine();
	System.out.print("reveresed : " );
	for(int i=s.length();i>0;--i){
		System.out.print(s.charAt(i-1));
	}
	}
}