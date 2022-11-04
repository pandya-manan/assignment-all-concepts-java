package RemoveDuplicates;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
	
	public static int removeDuplicateElements(int arr[], int size){  
        if (size==0 || size==1){  
            return size;  
        }    
        int x = 0; 
        for (int i=0; i < size-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[x++] = arr[i];  
            }  
        }  
        arr[x++] = arr[size-1];  
        return x;  
    }  
	
	public static void main(String args[])
	{
		int arr[]= {1,3,4,2,2,2,4,5,6,3,2,6,6,9,4,5,7,6,8,3,2,5,4,3,3,3,2};
		Arrays.sort(arr);
		System.out.println("Sorted Array");
		for (int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
		
		System.out.println();
		int lengthFinal=removeDuplicateElements(arr, arr.length);
		
		System.out.println("Removal of duplicate elements array");
		for(int i=0;i<lengthFinal;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
