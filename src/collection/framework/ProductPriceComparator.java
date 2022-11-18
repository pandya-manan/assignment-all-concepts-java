package collection.framework;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o2.getPrice().compareTo(o1.getPrice());
	}

	
	
}
