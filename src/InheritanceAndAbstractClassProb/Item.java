package InheritanceAndAbstractClassProb;

import java.util.List;

public abstract class Item {
	
	private Long identificationNumber;
	
	private String title;
	
	private int numberOfCopies;

	public Long getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(Long identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public Item(Long identificationNumber, String title, int numberOfCopies) {
		super();
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String toString() {
		return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", numberOfCopies="
				+ numberOfCopies + "]";
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	void checkIn(Book book, List<Book> listOfBooks) {
		// TODO Auto-generated method stub
		
	}

	void checkOut(Book book, List<Book> listOfBooks) {
		// TODO Auto-generated method stub
		
	}

	void checkIn(CD cd, List<CD> listOfCDs) {
		// TODO Auto-generated method stub
		
	}

	void checkOut(CD cd, List<CD> listOfCDs) {
		// TODO Auto-generated method stub
		
	}

	void checkOut(Video video, List<Video> listOfVideos) {
		// TODO Auto-generated method stub
		
	}

	void checkIn(Video video, List<Video> listOfVideos) {
		// TODO Auto-generated method stub
		
	}

	void checkIn(JournalPaper jp, List<JournalPaper> listOfJournalPaper) {
		// TODO Auto-generated method stub
		
	}

	void checkOut(JournalPaper jp, List<JournalPaper> listOfJournalPaper) {
		// TODO Auto-generated method stub
		
	}
	
		
}
