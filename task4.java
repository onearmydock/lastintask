import java.util.*;


class oddAndEven{
	public static void main(String[] arg){
		List<Integer> odd= new ArrayList<Integer>();
		List<Integer> even = new ArrayList<Integer>();
		
		for(int i=0;i<100;i++){
			if(i%2 == 0){
				even.add(i);
			}
			else{
				odd.add(i);
			}
		}
		System.out.print("odd : ");
		disp(odd);
		System.out.println("");
		System.out.print("even : ");
		disp(even);
	}
	public static void disp(List<Integer> list){
		for(int i:list){
			System.out.print(i+",");
		}
	}
}