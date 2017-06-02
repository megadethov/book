package sortingObjects;
import java.util.*;

public class MainMap {
	
	public static void main(String[] args) {
		Map<Book, Integer> books = new HashMap<>();
		books.put(new Book(1,"The Lord of the Rings","J. R. R. Tolkien"), 100);
		books.put(new Book(2,"Le Petit Prince","Antoine de Saint-Exupery"), 23);
		books.put(new Book(3,"Harry Potter and the Philosopher's Stone","J. K. Rowling"), 12);
		books.put(new Book(4,"And Then There Were None","Agatha Christie"), 93);
		books.put(new Book(5,"Dream of the Red Chamber","Cao Xueqin"), 8);
		books.put(new Book(6,"The Hobbit","J. R. R. Tolkien"), 44);
		books.put(new Book(7,"She: A History of Adventure","H. Rider Haggard"), 72);
		books.put(new Book(8,"The Lion, the Witch and the Wardrobe","C. S. Lewis"), 22);
		books.put(new Book(9,"The Da Vinci Code","Dan Brown"), 2);
		books.put(new Book(10,"The Catcher in the Rye","J. D. Salinger"), 26);
		books.put(new Book(11,"The Hobbit","A. A. Milne"), 77);

		Integer value = books.get((new Book(10, "The Catcher in the Rye", "J. D. Salinger")));
		System.out.println(value);

	}
}
