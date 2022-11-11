package InheritanceAndAbstractClassProb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Book extends WrittenItem {

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Long identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}

	public Book(Long identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return super.getAuthor();
	}

	@Override
	public void setAuthor(String author) {
		// TODO Auto-generated method stub
		super.setAuthor(author);
	}

	

	@Override
	public Long getIdentificationNumber() {
		// TODO Auto-generated method stub
		return super.getIdentificationNumber();
	}

	@Override
	public void setIdentificationNumber(Long identificationNumber) {
		// TODO Auto-generated method stub
		super.setIdentificationNumber(identificationNumber);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	@Override
	public int getNumberOfCopies() {
		// TODO Auto-generated method stub
		return super.getNumberOfCopies();
	}

	@Override
	public void setNumberOfCopies(int numberOfCopies) {
		// TODO Auto-generated method stub
		super.setNumberOfCopies(numberOfCopies);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getIdentificationNumber()=" + getIdentificationNumber()
				+ ", getTitle()=" + getTitle() + ", getNumberOfCopies()=" + getNumberOfCopies() + "]";
	}
	@Override
	void checkIn(Book book, List<Book>listOfBooks)
	{
		for(int i=0;i<listOfBooks.size();i++)
		{
		
		if(listOfBooks.get(i).getIdentificationNumber().equals(book.getIdentificationNumber()))
		{
			int initialCopies=listOfBooks.get(i).getNumberOfCopies();
			
			int finalSettingCopies=initialCopies+book.getNumberOfCopies();
			
			listOfBooks.get(i).setNumberOfCopies(finalSettingCopies);
			break;
		}
		else if(i==listOfBooks.size()-1)
		{
			listOfBooks.add(book);
		}
		else
			continue;
		 
		}
	}
	
	@Override
	void checkOut(Book book, List<Book>listOfBooks)
	{
		for(int i=0;i<listOfBooks.size();i++)
		{
		
		if(listOfBooks.get(i).getIdentificationNumber().equals(book.getIdentificationNumber()))
		{
			int initialCopies=listOfBooks.get(i).getNumberOfCopies();
			if(book.getNumberOfCopies()==1)
			{
				int finalSettingCopies=initialCopies-book.getNumberOfCopies();
				listOfBooks.get(i).setNumberOfCopies(finalSettingCopies);
				break;
			}
			else
			{
				System.out.println("Only 1 copy allowed to be checked out at one given moment!");
			}
			
			
		}
		
		}
	}
}
