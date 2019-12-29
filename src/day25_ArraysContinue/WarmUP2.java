package day25_ArraysContinue;
// unique vallues from the string array
public class WarmUP2 {
	public static void main(String[] args) {
		
		String [] arr = {"A","A","B","C","C"};
		
		for(int i = 0; i<arr.length ; i++) {
			int count = 0;
			for(int j = 0; j<arr.length; j++) {
				if(arr[i].contentEquals(arr[j])) {
					count+=1;
				}
			}
			if(count==1)
				System.out.println(arr[i]);
		}
	
	
	
	
	
	
	
	
	
	
	
		}
	}

