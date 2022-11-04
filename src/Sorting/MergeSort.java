package Sorting;

import java.util.Arrays;
public class MergeSort {
	
	public static void mergeSort(int[] a,int l, int r)
	{
		if(l<r)
		{
			int mid=(l+r)/2;
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}

	public static void merge(int[] a, int l, int mid, int r)
	{
		
		int i=l;
		int j=mid+1;
		int k=l;
		int b[]=new int[100];
		while(i<=mid && j<=r)
		{
			if(a[i]<a[j])
			{
				b[k]=a[i];
				i++;
			}
			else
			{
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=r)
			{
				b[k]=a[j];
				k++;
				j++;
			}
		}
		else
		{
			while(i<=mid)
			{
				b[k]=a[i];
				k++;
				i++;
			}
		}
		for(k=l;k<=r;k++)
		{
			a[k]=b[k];
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
