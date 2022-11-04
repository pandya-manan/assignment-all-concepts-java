package LinearSearch;
import java.util.*;
public class LinearSearchStringProg {
	
	public static void linearSearchString(List<String> arrayOfNames, String name)
	{
		boolean result=false;
		for (int i=0;i<arrayOfNames.size();i++)
		{
			if(arrayOfNames.get(i).contains(name))
			{
				result=true;
				break;
			}
		}
		if (result==true)
		{
			System.out.println(name+" is found linearly in the array");
		}
		else
		{
			System.out.println(name+" is not found in the array");
		}
	}
	
	public static void main(String[] args)
	{
		List<String> names=new ArrayList<String>();
		names.add("Sachin");
		names.add("Rahul Dravid");
		names.add("VVS Lakshman");
		names.add("Sourav G");
		names.add("Anil Kumble");
		names.add("Venkatesh Prasad");
		names.add("Javagal Srinath");
		names.add("Sehwag V");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name to be searched for: ");
		String name=sc.nextLine();
		linearSearchString(names, name);
	}

}
