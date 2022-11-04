package Sorting;

public class SelectionSort {
	
	public static int[] selectionSort(int[] listOfNumbers)
	{
		for(int i=0;i<listOfNumbers.length;i++)
		{
			int minimum_value=i;
			for(int j=i+1;j<listOfNumbers.length;j++)
			{
				if(listOfNumbers[j]<listOfNumbers[minimum_value])
				{
					minimum_value=j;
				}
			}
			if(minimum_value!=i)
			{
				int temp=listOfNumbers[minimum_value];
				listOfNumbers[minimum_value]=listOfNumbers[i];
				listOfNumbers[i]=temp;
			}
		}
		return listOfNumbers;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {10,33,44,2,3,77,55,66,43,564,6,76,8};
		System.out.println("Before Sorting:");
		for(Integer element:arr)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		int[] sortedArray=selectionSort(arr);
		System.out.println("After Selection Sort");
		for (int j=0;j<sortedArray.length;j++)
		{
			System.out.print(sortedArray[j]+" ");
		}
		
	}

}
