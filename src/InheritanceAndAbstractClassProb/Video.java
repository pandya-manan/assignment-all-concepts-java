package InheritanceAndAbstractClassProb;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
public class Video extends MediaItem {
	
	private String director;
	
	private String genre;
	
	private LocalDate yearReleased;
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(LocalDate localDate) {
		this.yearReleased = localDate;
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
		return "Video [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased
				+ ", getRuntime()=" + getRuntime() + ", getIdentificationNumber()="
				+ getIdentificationNumber() + ", getTitle()=" + getTitle() + ", getNumberOfCopies()="
				+ getNumberOfCopies() + "]";
	}

	@Override
	void checkIn(Video video, List<Video>listOfVideos)
	{
		for(int i=0;i<listOfVideos.size();i++)
		{
		
		if(listOfVideos.get(i).getIdentificationNumber().equals(video.getIdentificationNumber()))
		{
			int initialCopies=listOfVideos.get(i).getNumberOfCopies();
			
			int finalSettingCopies=initialCopies+video.getNumberOfCopies();
			
			listOfVideos.get(i).setNumberOfCopies(finalSettingCopies);
			break;
		}
		else if(i==listOfVideos.size()-1)
		{
			listOfVideos.add(video);
		}
		else
			continue;
		 
		}
	}
	
	@Override
	void checkOut(Video video, List<Video>listOfVideos)
	{
		for(int i=0;i<listOfVideos.size();i++)
		{
		
		if(listOfVideos.get(i).getIdentificationNumber().equals(video.getIdentificationNumber()))
		{
			int initialCopies=listOfVideos.get(i).getNumberOfCopies();
			if(video.getNumberOfCopies()==1)
			{
				int finalSettingCopies=initialCopies-video.getNumberOfCopies();
				listOfVideos.get(i).setNumberOfCopies(finalSettingCopies);
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
