package collection.comparable;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class listApp3_Comparator {

	public static void main(String[] args) {

		Set<Book> library = new TreeSet<Book>(new CompareBookYears());

		Book book1 = new Book("Шевченко", 1988, 350);
		Book book2 = new Book("Гоголь", 2012, 224);
		Book book3 = new Book("Франко", 1999, 122);
		Book book4 = new Book("Лисенко", 2002, 278);
		Book book5 = new Book("Щербак", 2018, 195);

		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);

		Iterator<Book> iter = library.iterator();
		Book iterBook;

		while (iter.hasNext()) {
			iterBook = iter.next();
			System.out.println(iterBook.getYear() + " " + iterBook.getAutor() + " " + iterBook.getPages());

		}

	}

}

class CompareBookYears implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.getYear() - o2.getYear();
	}

}

class CompareBookPages implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {

		return o1.getPages() - o2.getPages();
	}

}

class Book {

	private String autor;
	private int year;
	private int pages;

	public Book(String autor, int year, int pages) {
		this.autor = autor;
		this.year = year;
		this.pages = pages;
	}

	public String getAutor() {
		return autor;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}