package week1.day2;
import java.util.Arrays;
public class MissingElementInArray {
public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
			Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]!=i+1) {
				
				System.out.println("missing elemnt in  array is " + (i+1));
				break;
			}
			
		}
		
			}
		}	
	
		



