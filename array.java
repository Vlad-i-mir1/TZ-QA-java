package aston;

public class array {
	
	public static void main(String[] args) {
		
		int[] arrnum = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i =0; i < arrnum.length; i++) {
			
			if(arrnum[i] % 2 == 0) {
				
				System.out.print(arrnum[i] + " ");
			
			}
		}
		
	}

}
