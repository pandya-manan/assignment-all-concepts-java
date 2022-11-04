package Sorting;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] listOfNumbers)
	{
		int lengthOfList=listOfNumbers.length;
		boolean sortedCheck=false;
		while(!sortedCheck) {
			sortedCheck=true;
			for(int i=0;i<lengthOfList-1;i++)
			{
				if(listOfNumbers[i]>listOfNumbers[i+1])
				{
					sortedCheck=false;
					int temp=listOfNumbers[i];
					listOfNumbers[i]=listOfNumbers[i+1];
					listOfNumbers[i+1]=temp;
				}
			}
		}
		return listOfNumbers;
	}
	public static void main(String[] args)
	{
		int array[]= {5,2,9,7,0,1,8,6,12,11,9,10,3,13};
		System.out.println("Before Sorting:");
		for(Integer element:array)
		{
			System.out.print(element+" ");
		}
		System.out.println();
		bubbleSort(array);
		System.out.println("After Bubble Sort:");
		for(Integer element:array)
		{
			System.out.print(element+" ");
		}
	}
}
