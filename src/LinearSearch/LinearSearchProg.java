package LinearSearch;
import java.util.*;
public class LinearSearchProg {
//	Main method
	public static void main(String[] args)
	{
		List<Integer> array1=new ArrayList<Integer>();
		array1.add(1);
		array1.add(5);
		array1.add(7);
		array1.add(6);
		array1.add(4);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to be searched for: ");
		int element=sc.nextInt();
		
		returnMessageAfterSearch(array1,element);
		
	}
//	Helper method to do linear search
	public static void returnMessageAfterSearch(List<Integer> array, int element)
	{
		boolean result=false;
		for(int i=0;i<array.size();i++)
		{
			if(array.get(i)==element)
			{
				result=true;
				break;
			}
			
		}
		if(result==false)
		{
			System.out.println(element+" not found using linear search");
		}
		else
		{
			System.out.println(element+" found using linear search");
		}
	}

}
