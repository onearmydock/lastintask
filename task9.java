import java.util.*;

class duplicate{
	public static void main (String[] arg){
		String string = "Sakkett";
		/*
		for(int i=0;i<string.length();i++){
			int temp=0;
			for(int j = 0;j<string.length();j++){
				if(string.charAt(i)==string.charAt(j)){
					temp +=1;
				}
			}
			System.out.println(string.charAt(i)+":"+temp);
		}
		*/
		
		List<Character> letters = new ArrayList<Character>();
		List<Integer> count = new ArrayList<Integer>();
		int Stringlenth = string.length();
		
		for(int i =0;i<Stringlenth;i++){
			if(!letters.contains(string.charAt(i))){
				letters.add(string.charAt(i));
				count.add(1);
			}
			else{
				int occ = letters.indexOf(string.charAt(i));
				int specific_count = count.get(occ)+1;
				count.set(occ,specific_count);
			}
		}
		for(int i =0;i<letters.size();i++){
			System.out.println(letters.get(i)+" : " +count.get(i));
		}
		
		
		
		
	}
}