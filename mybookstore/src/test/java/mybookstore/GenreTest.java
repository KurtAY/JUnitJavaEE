package mybookstore;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class GenreTest {

	@Test
	public void test() {
		//BookCollection bookcollection = new BookCollection();
		Map<String, String> bookcollection = new HashMap<>();
		
		bookcollection.put("1", "Horror");
		bookcollection.put("2", "Comedy");
		bookcollection.put("3", "Thriller");
		bookcollection.put("4", "Action");
		bookcollection.put("5", "Indie");
		
		Map<String, String> expectedcollection = new HashMap<>();
		
		expectedcollection.put("1", "Horror");
		expectedcollection.put("2", "Comedy");
		expectedcollection.put("3", "Thriller");
		expectedcollection.put("4", "Action");
		expectedcollection.put("5", "Indie");
		
		assertEquals(bookcollection, expectedcollection);
	
				
		
	}

}
