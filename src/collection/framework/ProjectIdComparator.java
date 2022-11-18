package collection.framework;

import java.util.Comparator;

public class ProjectIdComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getId().compareTo(o2.getId());
	}
	
	

}
