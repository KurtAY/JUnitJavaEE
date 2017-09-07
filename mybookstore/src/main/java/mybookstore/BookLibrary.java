package mybookstore;

import java.util.HashMap;
import java.util.Map;

public class BookLibrary {
	
	Map<Integer, Book> bookcollection = new HashMap<>();
	
	Book b1 = new Book(1, "Horror");
	Book b2 = new Book(2, "Comedy");
	Book b3 = new Book(3, "Thriller");
	Book b4 = new Book(4, "Action");
	
	void addBook(){
			
		addToBookCollection();
	}

	public Map<Integer, Book> getBookCollection(){
		
		return this.bookcollection;
	}
	
	private void addToBookCollection() {
		
		bookcollection.put(1, b1);
		bookcollection.put(2, b2);
		bookcollection.put(3, b3);
		bookcollection.put(4, b4);
	}
	
	private int getCountOfGenre(String genre){
		int count=0;
		for(int i = 1; i < bookcollection.size(); i++){
			if(bookcollection.get(i).getgenre().equals(genre)){
				count++;
			}
		}
		return count;
	}
			
}
