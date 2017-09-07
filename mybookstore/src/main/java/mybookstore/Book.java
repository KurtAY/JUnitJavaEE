package mybookstore;

public class Book {

	int id;
	String genre;
	
	public Book(int bookid, String bookgenre){
		this.id = bookid;
		this.genre = bookgenre;
	}
	
	public int getid(){
		return this.id;
	}
	
	public String getgenre(){
		return this.genre;
	}
			
}
