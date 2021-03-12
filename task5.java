import java.util.*;

class Sort{
	public static void main(String[] arg){
		int[] array =  {1,2,3,-7,-10-99};
		sort(array);
		
	}
	
	public static void sort(int[] array){
		int array_length = array.length;
		for(int i =0;i<array_length;i++){
			for(int j=i+1;j<array_length;j++){
				if(array[i]>array[j]){
					int temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		for(int k:array){
			System.out.print(k+",");
		
		}
		
	}
}