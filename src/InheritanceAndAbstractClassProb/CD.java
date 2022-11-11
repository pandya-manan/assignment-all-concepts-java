package InheritanceAndAbstractClassProb;

import java.util.List;

public class CD extends MediaItem{
	
	private String artist;
	
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public CD(String artist, String genre) {
		super();
		this.artist = artist;
		this.genre = genre;
	}

	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CD(Long identificationNumber, String title, int numberOfCopies, int runtime) {
		super(identificationNumber, title, numberOfCopies, runtime);
		// TODO Auto-generated constructor stub
	}

	public CD(Long identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRuntime() {
		// TODO Auto-generated method stub
		return super.getRuntime();
	}

	@Override
	public void setRuntime(int runtime) {
		// TODO Auto-generated method stub
		super.setRuntime(runtime);
	}

	

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre    
				 + ", getRuntime()=" + getRuntime() + ", getIdentificationNumber()="
				+ getIdentificationNumber() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()="
				+ getNumberOfCopies() + "]";
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
	void checkIn(CD cd, List<CD>listOfCDs)
	{
		for(int i=0;i<listOfCDs.size();i++)
		{
		
		if(listOfCDs.get(i).getIdentificationNumber().equals(cd.getIdentificationNumber()))
		{
			int initialCopies=listOfCDs.get(i).getNumberOfCopies();
			
			int finalSettingCopies=initialCopies+cd.getNumberOfCopies();
			
			listOfCDs.get(i).setNumberOfCopies(finalSettingCopies);
			break;
		}
		else if(i==listOfCDs.size()-1)
		{
			listOfCDs.add(cd);
		}
		else
			continue;
		 
		}
	}
	
	@Override
	void checkOut(CD cd, List<CD>listOfCDs)
	{
		for(int i=0;i<listOfCDs.size();i++)
		{
		
		if(listOfCDs.get(i).getIdentificationNumber().equals(cd.getIdentificationNumber()))
		{
			int initialCopies=listOfCDs.get(i).getNumberOfCopies();
			if(cd.getNumberOfCopies()==1)
			{
				int finalSettingCopies=initialCopies-cd.getNumberOfCopies();
				listOfCDs.get(i).setNumberOfCopies(finalSettingCopies);
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
