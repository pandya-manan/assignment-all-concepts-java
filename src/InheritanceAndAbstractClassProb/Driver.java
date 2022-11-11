package InheritanceAndAbstractClassProb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();
		//Writing the code for written item Book of category 1
		Book book1=new Book();
		book1.setAuthor("Ruskin Bond"); //author is the only thing unique in the type Book 
		book1.setIdentificationNumber(900022221l); //Coming from Item and Written Item abstract classes
		book1.setNumberOfCopies(5); //Coming from Item and Written Item abstract classes
		book1.setTitle("The Blue Umbrella"); //Coming from the Item and Written Item abstract classes
		
		//Writing the code for written item Book of category 2
		Book book2=new Book();
		book2.setAuthor("Enid Blyton");
		book2.setIdentificationNumber(23345421l);
		book2.setNumberOfCopies(3);
		book2.setTitle("Famous Five");
		
		
		//Writing the code for written item Journal Paper of category 1
		JournalPaper journalPaper1=new JournalPaper();
		journalPaper1.setAuthor("Bhanuprakash");
		journalPaper1.setIdentificationNumber(9332242l);
		journalPaper1.setYearPublished(LocalDate.of(2017, 2, 11));
		journalPaper1.setNumberOfCopies(1);
		journalPaper1.setTitle("Fluid Mechanics");
		
		//Writing the code for written item Journal Paper of category 2
		JournalPaper journalPaper2=new JournalPaper();
		journalPaper2.setAuthor("Veeresh Kumar GB");
		journalPaper2.setIdentificationNumber(33287464l);
		journalPaper2.setNumberOfCopies(1);
		journalPaper2.setTitle("Advanced and Smart Materials");
		journalPaper2.setYearPublished(LocalDate.of(2015, 8, 12));
		
		
		//Writing the code for media item video of type 1
		Video video1=new Video();
		video1.setIdentificationNumber(444342l);
		video1.setDirector("Don Omar,Lucenzo");
		video1.setGenre("Pop");
		video1.setRuntime(5);
		video1.setNumberOfCopies(3);
		video1.setTitle("Danza Kuduro");
		video1.setIdentificationNumber(556664l);
		video1.setYearReleased(LocalDate.of(2011, 10, 2));
		
		//Writing the code for the media item video of type2 
		Video video2=new Video();
		video2.setIdentificationNumber(12232l);
		video2.setDirector("Justin Timberlake");
		video2.setGenre("Pop");
		video2.setRuntime(5);
		video2.setNumberOfCopies(3);
		video2.setTitle("Can't Stop the Feeling");
		video2.setIdentificationNumber(556664l);
		video2.setYearReleased(LocalDate.of(2016, 5, 6));
		
		//Making CD type object 1 for media type
		CD cd1=new CD();
		cd1.setArtist("Michael Jackson");
		cd1.setGenre("Crime and Horror");
		cd1.setRuntime(6);
		cd1.setIdentificationNumber(9923475l);
		cd1.setTitle("Thriller");
		cd1.setNumberOfCopies(5);
		
		//Making a list of the entire video collection at the library
		List<Video> listOfVideos=new ArrayList<Video>();
		listOfVideos.add(video1);
		listOfVideos.add(video2);
		
		
		//Making a list of the books at the library
		List<Book>listOfBooks=new ArrayList<Book>();
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		
		//Making a list of the journal papers at the library
		List<JournalPaper>listOfJournalPaper=new ArrayList<JournalPaper>();
		listOfJournalPaper.add(journalPaper1);
		listOfJournalPaper.add(journalPaper2);
		
		//Making a list of the CDs available at the library
		List<CD> listOfCDs=new ArrayList<CD>();
		listOfCDs.add(cd1);
		
		System.out.println("Welcome to Online Digital Library");
		System.out.println("The Media Items present are: ");
		
		System.out.println("The CD Collection available is as follows: ");
		listOfCDs.stream().forEach(t->System.out.println(t));
		
		System.out.println("The Videos Collection is as follows: ");
		listOfVideos.stream().forEach((t)->System.out.println(t));
		
		System.out.println("The Written Items present are: ");
		System.out.println("The Journal Paper Collection is as follows: ");
		listOfJournalPaper.stream().forEach(j->System.out.println(j));
		
		System.out.println("The Books Collection is as follows: ");
		listOfBooks.stream().forEach((t)->System.out.println(t));
		
		//Book to be checked in whose information is already there in a listOfBooks
		Book book3=new Book();
		book3.setAuthor("Ruskin Bond"); //author is the only thing unique in the type Book 
		book3.setIdentificationNumber(900022221l); //Coming from Item and Written Item abstract classes
		book3.setNumberOfCopies(3); //Coming from Item and Written Item abstract classes
		book3.setTitle("The Blue Umbrella"); //Coming from the Item and Written Item abstract classes
		
		//New Category of Book to be checked in whose information is not there in a listOfBooks
		Book book4=new Book();
		book4.setAuthor("Franklin Dixon");
		book4.setIdentificationNumber(77445353l);
		book4.setNumberOfCopies(2);
		book4.setTitle("Hardy Boys");
		
		book3.checkIn(book3, listOfBooks);
		book4.checkIn(book4, listOfBooks);
		
		Book book5=new Book();
		book5.setAuthor("Ruskin Bond"); //author is the only thing unique in the type Book 
		book5.setIdentificationNumber(900022221l); //Coming from Item and Written Item abstract classes
		book5.setNumberOfCopies(1); //Coming from Item and Written Item abstract classes
		book5.setTitle("The Blue Umbrella"); //Coming from the Item and Written Item abstract classes
				
		book5.checkOut(book5, listOfBooks);
		book5.checkOut(book5, listOfBooks);
		book4.checkOut(book4, listOfBooks);
		
		JournalPaper journalPaper3=new JournalPaper();
		journalPaper3.setAuthor("Bhanuprakash");
		journalPaper3.setIdentificationNumber(9332242l);
		journalPaper3.setYearPublished(LocalDate.of(2017, 2, 11));
		journalPaper3.setNumberOfCopies(1);
		journalPaper3.setTitle("Fluid Mechanics");
		
		JournalPaper journalPaper4=new JournalPaper();
		journalPaper4.setAuthor("Shali");
		journalPaper4.setIdentificationNumber(00004433322l);
		journalPaper4.setYearPublished(LocalDate.of(2013, 1, 23));
		journalPaper4.setNumberOfCopies(2);
		journalPaper4.setTitle("Fluid Mechanics and Flight Systems");
		
		journalPaper3.checkIn(journalPaper3, listOfJournalPaper);
		journalPaper4.checkOut(journalPaper4, listOfJournalPaper);
		
		Video video3=new Video();
		video3.setIdentificationNumber(444342l);
		video3.setDirector("Don Omar,Lucenzo");
		video3.setGenre("Pop");
		video3.setRuntime(5);
		video3.setNumberOfCopies(4);
		video3.setTitle("Danza Kuduro");
		video3.setIdentificationNumber(556664l);
		video3.setYearReleased(LocalDate.of(2011, 10, 2));
		
		video3.checkIn(video3, listOfVideos);
		
		CD cd2=new CD();
		cd2.setArtist("Selena Gomez");
		cd2.setGenre("Love and Crrime");
		cd2.setRuntime(10);
		cd2.setIdentificationNumber(333241113l);
		cd2.setTitle("Can't keep my hands to myself");
		cd2.setNumberOfCopies(4);
		
		cd2.checkIn(cd2, listOfCDs);
		
		System.out.println("Welcome to Online Digital Library");
		System.out.println("The Media Items present are: ");
		System.out.println("The CD Collection after checkOut and checkIn available is as follows: ");
		listOfCDs.stream().forEach(t->System.out.println(t));
		
		System.out.println("The Videos Collection after checkOut and checkIn is as follows: ");
		listOfVideos.stream().forEach((t)->System.out.println(t));
		
		System.out.println("The Written Items present are: ");
		System.out.println("The Journal Paper Collection after checkOut and checkIn is as follows: ");
		listOfJournalPaper.stream().forEach(j->System.out.println(j));
		
		System.out.println("The Books Collection after checkOut and checkIn is as follows: ");
		listOfBooks.stream().forEach((t)->System.out.println(t));
	}

}
