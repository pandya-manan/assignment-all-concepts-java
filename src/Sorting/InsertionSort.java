package Sorting;

public class InsertionSort {
	
	public static int[] insertionSort(int[] listOfNumbers)
	{
		int length=listOfNumbers.length;
		int i, j, temp;  
	    for (i = 1; i < length; i++) {  
	        temp = listOfNumbers[i];  
	        j = i - 1;  
	  
	        while(j>=0 && temp <= listOfNumbers[j])  
	        {    
	        	listOfNumbers[j+1] = listOfNumbers[j];     
	            j = j-1;    
	        }    
	        listOfNumbers[j+1] = temp;    
	    }  
		return listOfNumbers;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {9,77,4,3,2,99,4,3,66,22,2,33,22,4,90,4};
		System.out.println("Before sorting:");
		for(Integer element:arr)
		{
			System.out.print(element+" ");
		}
		int[] sortedArray=insertionSort(arr);
		System.out.println();
		System.out.println("After Insertion Sort:");
		for (int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}
		
	}

}
