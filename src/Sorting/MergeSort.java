package Sorting;

import java.util.Arrays;
public class MergeSort {
	
	public static void mergeSort(int[] array,int left, int right)
	{
		if(left<right)
		{
			int mid=(left+right)/2;
			mergeSort(array,left,mid);
			mergeSort(array,mid+1,right);
			merge(array,left,mid,right);
		}
	}

	public static void merge(int[] array, int left, int mid, int right)
	{
		
		int i=left;
		int j=mid+1;
		int k=left;
		int dummyArray[]=new int[100];
		while(i<=mid && j<=right)
		{
			if(array[i]<array[j])
			{
				dummyArray[k]=array[i];
				i++;
			}
			else
			{
				dummyArray[k]=array[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=right)
			{
				dummyArray[k]=array[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i<=mid)
			{
				dummyArray[k]=array[i];
				k++;
				i++;
			}
		}
		for(k=left;k<=right;k++)
		{
			array[k]=dummyArray[k];
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] array= {6,7,4,8,9,3,4,1};
		System.out.println("The Array before sorting: ");
		System.out.println(Arrays.toString(array));
		mergeSort(array,0,array.length-1);
		System.out.println("The Array after merge sort: ");
		System.out.println(Arrays.toString(array));
	}
}
