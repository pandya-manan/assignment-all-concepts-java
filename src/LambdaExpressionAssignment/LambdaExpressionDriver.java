package LambdaExpressionAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressionDriver {
	
	public static void main(String[] args)
	{
		Function<Integer,Integer> returnPower=(t)->
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of terms: ");
			int terms=sc.nextInt();
			int i=0;
			for(;i<terms;i++)
			{
				System.out.println(t+" raised to the power of "+i+" is:"+(int)(Math.pow(t, i)));
			}
			return (int)Math.pow(t, i);
		};
		System.out.println("The final power is: "+returnPower.apply(5));
		
		Predicate<Integer> isPrimeNumberOrNot=(num)->
		{
			if(num==1 ||num==0)
			{
				return false;
			}
			int flag=1;
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{					
					flag=0;
					break;
				}
			}
			if(flag==1)
				return true;
			
			else
				return false;
			
		};
		System.out.println("The number 13 is prime? :"+isPrimeNumberOrNot.test(13));
		System.out.println("The number 15 is prime? :"+isPrimeNumberOrNot.test(15));
		System.out.println("The number 1 is prime? :"+isPrimeNumberOrNot.test(0));
		Predicate<Employee> employeeHasMinimumSalary=(emp)->
		{
			if(emp.getSalary()>=25000)
			{
				System.out.println("Yes Minimum Salary is being obtained by the Employee which is 25000");
				return true;
			}
			else
			{
				System.out.println("No Minimum Salary is not obtained, hence please increase the wages.");
				return false;
			}
			
		};
		System.out.println("Is Employee getting minimum salary? :"+employeeHasMinimumSalary.test(new Employee(1,"Employee1",10000.0)));
		System.out.println("Is Employee getting minimum salary? :"+employeeHasMinimumSalary.test(new Employee(2,"Employee2",26500.0)));
		
		Function<List<Cars>,Integer> returnNumberOfCarsHavingPriceMoreFiftyThousand=(car)->
		{
			int sizeOfCar=car.size();
			int result=0;
			for(int i=0;i<sizeOfCar;i++)
			{
				if(car.get(i).getPrice()>50000)
					result++;
				
			}
			return result;
		};
		
		Cars car1=new Cars("Alto",48000);
		Cars car2=new Cars("Mercedes Benz S Class",100000);
		Cars car3=new Cars("BMW",600000);
		Cars car4=new Cars("Maruti 800",30000);
		
		List<Cars> carsList=new ArrayList<Cars>();
		carsList.add(car1);
		carsList.add(car2);
		carsList.add(car3);
		carsList.add(car4);
		
		System.out.println("The result of number of cars having more than 50000 price is: "+returnNumberOfCarsHavingPriceMoreFiftyThousand.apply(carsList));
		
	}
	
	
	
	
}
