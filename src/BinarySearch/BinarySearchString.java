package BinarySearch;
import java.util.*;
public class BinarySearchString {
	
	public static int binarySearchString(String[] array, String city)
	{
		int leftEnd = 0, rightEnd = array.length - 1;
        while (leftEnd <= rightEnd) {
            int mid = (leftEnd+rightEnd)/2;
            int result = city.compareTo(array[mid]);
            if (result == 0)
            {
            	 return mid;
            }
                       
            if (result > 0)
            {
            	leftEnd = mid + 1;
            }
                        
            else
            {
            	rightEnd = mid - 1;
            }
                
        }
 
        return -1;
	}
	 public static void main(String args[]){
			String[] array= {"bangalore","pune","noida","delhi","haridwar","chennai","coimbatore","ahmedabad","jhansi","mysore","belagavi","hubbali","surat","khagadiya"};
			Arrays.sort(array);
			System.out.println("Sorted out string array: ");
			for(int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+" ");
			}
		    Scanner sc=new Scanner(System.in);
		    System.out.println();
		    System.out.println("Enter the element to be searched for using binary search: ");
		    String inputFromUser=sc.next();
		        
		    System.out.println(inputFromUser+" is found at index: "+binarySearchString(array, inputFromUser));  
		 }

}
