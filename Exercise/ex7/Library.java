//implement classes for a Library There are diffrent type of books
//are available in the library like Printed books, E books, and Audio books
//You must use inhertance, polymorphism, encapuslation... 

class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}

class PrintedBook extends Book {
	private int pages;
	
	public PrintedBook(String title, String author, int pages) {
		super(title,author);
		this.pages = pages;
	}
	
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Pages: " + pages);
	}
}

class Ebook extends Book {
	private double fileSize;
	
	public Ebook(String title, String author, double fileSize) {
		super(title, author);
		this.fileSize = fileSize;
	}
	
	public double getFileSize() {
		return fileSize;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File Size: " + fileSize + "MB");
	}
}

class AudioBook extends Book {
	private double duration;
	
	public AudioBook(String title, String author, double duration) {
		super(title, author);
		this.duration = duration;
	}
	
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Duration: " + duration + "hours");
	}
}

public class Library {
	public static void main(String args[]) {
		Book printedBook = new PrintedBook("The Java Programming", "John Doe", 300);
		Book ebook = new Ebook("Learning Python", "Jane Smith", 2.5);
		Book audioBook = new AudioBook("Data Science for Beginners", "Michael Johnson", 10.5);
		
		System.out.println("Printed Book Details:");
		printedBook.displayDetails();
		
		System.out.println("\nEbook Details:");
		ebook.displayDetails();
		
		System.out.println("\nAudiobook Details:");
		audioBook.displayDetails();
	}
}