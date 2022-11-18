package com.streamapi.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class ProductDriver {
	
	public static void main(String[] args)
	{
		//Creating individual chips product catalog
		Product product1=new Product("Lays",10.0,1,LocalDate.of(2014, 3, 12));
		Product product2=new Product("Kurkure",10.0,2,LocalDate.of(2015, 4, 12));
		Product product3=new Product("Piknik",30.0,3,LocalDate.of(2014, 11, 21));
		Product product4=new Product("Cheese Balls",45.0,4,LocalDate.of(2016, 3, 11));
		Product product5=new Product("Uncle Chips",15.0,5,LocalDate.of(2017, 3, 10));
		Product product6=new Product("Balaji Wafers",5.0,6,LocalDate.of(2018, 2, 12));
		Product product7=new Product("Gopal Salted",25.0,7,LocalDate.of(2018, 3, 21));
		Product product8=new Product("Haldirams Chips",35.0,8,LocalDate.of(2019, 2, 01));
		Product product9=new Product("Cheetos Beyblade edition",100.0,9,LocalDate.of(2018, 3, 12));
		Product product10=new Product("Bingo Red Triangle",25.0,10,LocalDate.of(2020, 9, 12));
		Product product11=new Product("Bingo Masti",34.0,11,LocalDate.of(2021, 9, 15));
		Product product12=new Product("Yellow Diamond",14.0,12,LocalDate.of(2022, 1, 04));
		
		//Adding in a list
		List<Product> listOfChips=new ArrayList<>();
		listOfChips.add(product1);
		listOfChips.add(product2);
		listOfChips.add(product3);
		listOfChips.add(product4);
		listOfChips.add(product5);
		listOfChips.add(product6);
		listOfChips.add(product7);
		listOfChips.add(product8);
		listOfChips.add(product9);
		listOfChips.add(product10);
		listOfChips.add(product11);
		listOfChips.add(product12);
		
		//The Catalog of chips originally made
		System.out.println("The Catalog of chips is present as: ");
		System.out.println(listOfChips);
		System.out.println();
		//Writing Function Lambda Implementation to get the maximum price of a product from the catalog of products in list
		Function<Product,Double> retrieveMax= p->
		{
			Double maxPrice=0.0;
			maxPrice=p.getPrice();
			return maxPrice;
		};
		
		//Task1 --> Using Stream API find all the Products having  productPrice < maxPrice. BEGINS
		List<Double>resultantMaxPrice=listOfChips.stream().sorted((p1,p2)->p2.getPrice().compareTo(p1.getPrice())).limit(1).map(retrieveMax).collect(Collectors.toList());
		System.out.println("The Product with the maximum price is: "+resultantMaxPrice);
//		.forEach((p)->System.out.println(p.getPrice()));
		Double maxPrice=resultantMaxPrice.get(0);	
		List<Product> listOfProductsLessThanMaxPrice=listOfChips.stream().filter((a)->a.getPrice()< maxPrice).collect(Collectors.toList());
		System.out.println("The Products whose price is less than max price: ");
		System.out.println(listOfProductsLessThanMaxPrice);
		System.out.println();
		//Task 1 ENDS.
		
		//Task 2 Using Stream API find all Products expiring by this month . [add suitable fields to Product POJO]. BEGINS
		//For demo purpose, lets assume the current date is 2019-02-01 which means products expiring in the month of 08 and year 2019--> current date 2019-02-01 
		LocalDate expiryCheckDate=LocalDate.of(2019, 2, 01);
		Predicate<Product> checkForExpiry =(p)-> 
		{
			boolean result=((p.getProductExpiryDate().getDayOfMonth()==expiryCheckDate.getDayOfMonth())&&(p.getProductExpiryDate().getDayOfYear()==expiryCheckDate.getDayOfYear()));
			return result;
		};
		System.out.println("Trial test: "+checkForExpiry.test(product8));
		List<Product> productExpiringCurrentYrMonth=listOfChips.stream().filter(checkForExpiry).collect(Collectors.toList());
		System.out.println(productExpiringCurrentYrMonth);
		System.out.println();
		//Task2 ENDS
		
		//TASK3 STARTS Find 5 oldest and newest Products using Stream API [add suitable fields to Product POJO]
		List<Product> listOfOldProducts=listOfChips.stream().sorted((p1,p2)->p1.getProductExpiryDate().compareTo(p2.getProductExpiryDate())).limit(5).collect(Collectors.toList());
		System.out.println("List Of 5 Old Products: "+listOfOldProducts);
		
		List<Product> listOfNewProducts=listOfChips.stream().sorted((p1,p2)->p2.getProductExpiryDate().compareTo(p1.getProductExpiryDate())).limit(5).collect(Collectors.toList());
		System.out.println("List Of 5 New Products: "+listOfNewProducts);
		//TASK3 ENDS 
	}

}
