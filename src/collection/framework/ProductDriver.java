package collection.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDriver {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		Product product1=new Product("Lays",33323,10);
		Product product2=new Product("Colgate",998787,100);
		Product product3=new Product("Maida",13332,50);
		Product product4=new Product("Britannia Biscuit",883636,25);
		Product product5=new Product("Parle G",448373,20);
		
		//Create operation
		HashMap<Integer,Product> mapOfProducts=new HashMap<>();
		mapOfProducts.put(1, product1);
		mapOfProducts.put(2, product2);
		mapOfProducts.put(3, product3);
		mapOfProducts.put(4, product4);
		mapOfProducts.put(5, product5);
		
		System.out.println("The Initial Map Of Products made: ");
		mapOfProducts.forEach((t,v)->System.out.println(t+" "+v));
		System.out.println();
		
		//Read operation
		//1.based on containsKey,containsValue,get
		System.out.println("Is Britannia Biscuit present in the products?: "+mapOfProducts.containsValue(product4));
		System.out.println("Is Pepsi present in the products?: "+mapOfProducts.containsValue(new Product("Pepsi",7776363,25)));
		System.out.println("Is the key number 5 present in the Products Map corresponding to ParleG?: "+mapOfProducts.containsKey(5));
		System.out.println("Is the key value 6 present in the Products Map corresponding to Pepsi?: "+mapOfProducts.containsKey(6));
		System.out.println("The product at key value 2 is: "+mapOfProducts.get(2));
		System.out.println();
		
		//Update Operation
		//1.Based on replace 
		Product product5New=new Product("Parle G",9973372,35);
		System.out.println("The Product with key value 5 is: "+mapOfProducts.get(5));
		mapOfProducts.replace(5, product5New);
		System.out.println("The Updated Product with the key value 5 is: "+mapOfProducts.get(5));
		System.out.println("The product with key value 4 is: "+mapOfProducts.get(4));
		mapOfProducts.replace(4, product4, new Product("Oreo",44388732,30));
		System.out.println("The Updated Product at key value is 4: "+mapOfProducts.get(4));
		
		//Delete Operation
		//1.Based on remove
		System.out.println();
		System.out.println("The product with key value 1 is: "+mapOfProducts.get(1));
		mapOfProducts.remove(1);
		System.out.println("Is the product with key value 1 present? If false success removal by key: "+mapOfProducts.containsKey(1));
		
		//Converting the map to list 
		Set<Integer> keyOfProducts=mapOfProducts.keySet();
		ArrayList<Integer> listOfValues=new ArrayList<>(keyOfProducts);
		Collection<Product> listOfProductsFromMap=mapOfProducts.values();
		
		System.out.println("The Keys of HashMap are: "+keyOfProducts);
		System.out.println("The Values of the HashMap are: "+listOfProductsFromMap);
		
		//Converting the map to list for sorting
		List finalListOfProducts=new ArrayList(listOfProductsFromMap);
		finalListOfProducts.sort(new ProductNameComparator());
		System.out.println();
		System.out.println("The Final List Of Products sorted by Name: "+finalListOfProducts);
		finalListOfProducts.sort(new ProductPriceComparator());
		System.out.println("The Final List Of Products sorted by Price: "+finalListOfProducts);
		finalListOfProducts.sort(new ProjectIdComparator());
		System.out.println("The Final List Of Products sorted by Id: "+finalListOfProducts);
		System.out.println();
		
		//Unique Products in SET based on Id
		Set<Product> setOfProducts=new HashSet<>();
		setOfProducts.addAll(finalListOfProducts);
		
		System.out.println("The unique set of products are: "+setOfProducts);
		
		
		
		
	}

}
