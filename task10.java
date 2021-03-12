

class SecondLargest{
	public static void main(String[] arg){
		int array[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		
		int array_length = array.length;
		for(int i =0;i<array_length;i++){
			for(int j=i+1;j<array_length;j++){
				if(array[i]<array[j]){
					int temp = array[i];
					array[i]= array[j];
					array[j] = temp;
				}
			}
		}
		for(int k:array){
			System.out.print(k+",");
		
		}
		System.out.println("");
		System.out.println("second largest numb : "+array[1]);
	}
}