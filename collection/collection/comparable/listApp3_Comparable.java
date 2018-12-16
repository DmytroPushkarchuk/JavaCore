package collection.comparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class listApp3_Comparable {

	static List<Books> library = new LinkedList<Books>();

	public static void main(String[] args) {

		library.add(new Books("Шевченко", 1988, 350));
		library.add(new Books("Гоголь", 2012, 224));
		library.add(new Books("Франко", 1999, 122));
		library.add(new Books("Лисенко", 2002, 278));
		library.add(new Books("Щербак", 2018, 195));

		Collections.sort(library);

		print();

		Collections.sort(library, new YearCamparator());

		print();

		Collections.sort(library, new PagesCamparator());

		print();
	}

	public static void print() {
		Iterator<Books> iter = library.iterator();

		while (iter.hasNext()) {
			Books iterBook = iter.next();
			System.out.println(iterBook);
		}

	}

}

class YearCamparator implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {

		return o1.getYear() - (o2.getYear());

	}

}

class PagesCamparator implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {
		return o1.getPages() - o2.getPages();
	}

}

class Books implements Comparable<Books> {

	private String autor;
	private Integer year;
	private Integer pages;

	public Books(String autor, int year, int pages) {
		this.autor = autor;
		this.year = year;
		this.pages = pages;
	}

	@Override
	public int compareTo(Books book) {
		return this.autor.compareTo(book.autor);
		// return this.year - book.year ; }

	}

	@Override
	public String toString() {
		return "[" + autor + ", " + year + ", " + pages + "]";
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
