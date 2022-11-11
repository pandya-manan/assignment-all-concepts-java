package InheritanceAndAbstractClassProb;

import java.util.List;

public class WrittenItem extends Item {
	
	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + ", getAuthor()=" + getAuthor() + ", getIdentificationNumber()="
				+ getIdentificationNumber() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()="
				+ getNumberOfCopies() + ", toString()=" + super.toString() + 
				 "]";
	}

	public WrittenItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(Long identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	public WrittenItem(Long identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies);
		this.author = author;
	}

	

	
}
