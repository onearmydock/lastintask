import java.util.*;

class itterate{
	public static void main(String[] arg){
		ArrayList<Integer> arayList = new ArrayList<Integer>();
		
		arayList.add(10);
		arayList.add(13);
		arayList.add(14);
		arayList.add(4);
		arayList.add(5);
		arayList.add(8);
		arayList.add(8);
		
		System.out.println("forloop");
		for(int i=0;i<arayList.size();i++){
			System.out.print(arayList.get(i)+",");
		}
		
		System.out.println("\n"+"whileloop");
		int count = 0;
		while(arayList.size()>count){
			System.out.print(arayList.get(count)+",");
			count+=1;
		}
		System.out.println("\n"+"for-each");
		for(int a:arayList){
			System.out.print(a+",");
		}
		
	}
}