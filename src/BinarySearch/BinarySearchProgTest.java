package BinarySearch;
import java.util.*;
public class BinarySearchProgTest {
	
//	Helper method to do binary search
	public static int binarySearch(int[] data, int element){    
			int leftEnd = 0;
	        int rightEnd = data.length - 1;
	        while (leftEnd <= rightEnd) {
	            int mid = (leftEnd + rightEnd) / 2;
	            if (element == data[mid]) {
	                return mid;
	            }
	            if (element < data[mid]) {
	                rightEnd = mid - 1;
	            } else {
	                leftEnd = mid + 1;
	            }
	        }
	        return -1;  
	    }    
//	 Main method
	    public static void main(String args[]){
		int[] array= {50,127,130,150,170,910,1009,1100,1400,2333,8000,98765};    
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the element to be searched for using binary search: ");
	        int element=sc.nextInt();
	        
	        System.out.println(element+" is found at index: "+binarySearch(array, element));  
	   }

}
