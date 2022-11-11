package InheritanceAndAbstractClassProb;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
public class JournalPaper extends WrittenItem {
	
	private LocalDate yearPublished;

	public JournalPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(Long identificationNumber, String title, int numberOfCopies, String author) {
		super(identificationNumber, title, numberOfCopies, author);
		// TODO Auto-generated constructor stub
	}

	public JournalPaper(Long identificationNumber, String title, int numberOfCopies) {
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
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor()
				+ ", getIdentificationNumber()=" + getIdentificationNumber() + ", getTitle()=" + getTitle()
				+ ", getNumberOfCopies()=" + getNumberOfCopies() + "]";
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
	

	public LocalDate getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(LocalDate localDate) {
		this.yearPublished = localDate;
	}
	
	@Override
	void checkIn(JournalPaper jp, List<JournalPaper>listOfJournalPaper)
	{
		for(int i=0;i<listOfJournalPaper.size();i++)
		{
		
		if(listOfJournalPaper.get(i).getIdentificationNumber().equals(jp.getIdentificationNumber()))
		{
			int initialCopies=listOfJournalPaper.get(i).getNumberOfCopies();
			
			int finalSettingCopies=initialCopies+jp.getNumberOfCopies();
			
			listOfJournalPaper.get(i).setNumberOfCopies(finalSettingCopies);
			break;
		}
		else if(i==listOfJournalPaper.size()-1)
		{
			listOfJournalPaper.add(jp);
		}
		else
			continue;
		 
		}
	}
	
	@Override
	void checkOut(JournalPaper jp, List<JournalPaper>listOfJournalPaper)
	{
		for(int i=0;i<listOfJournalPaper.size();i++)
		{
		
		if(listOfJournalPaper.get(i).getIdentificationNumber().equals(jp.getIdentificationNumber()))
		{
			int initialCopies=listOfJournalPaper.get(i).getNumberOfCopies();
			if(jp.getNumberOfCopies()==1)
			{
				int finalSettingCopies=initialCopies-jp.getNumberOfCopies();
				listOfJournalPaper.get(i).setNumberOfCopies(finalSettingCopies);
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
