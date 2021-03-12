
class SplitString{
	public static void main(String[] arg){
		String str = "Hi Jayan Bala Mani Swetha Abi Jayan Lucy Abi Jayan Lucy";
		String[] split = str.split(" ",0);
		
		for(String s:split){
			int count = 0;
			for(String check:split){
				if(s.equals(check)){
					count+=1;
				}
			}
			System.out.println(s+" : "+count);
		}
	}
}
