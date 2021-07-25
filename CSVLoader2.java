package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader2 {
	
	public static BookQ7[] bookLoader2(String filePath) {
		List<BookQ7> bookList = new ArrayList<BookQ7>();
		try {
			File file = new File(filePath);
			if (!file.exists())
				System.out.println("No file");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null, insert = null;
			String[] tokens = null;
			
			while ((line = reader.readLine()) != null) {
				line = line.replaceAll("'", " ");
				// regex to split on commas except if between double quotes
				tokens = line.split(",(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)", -1);

				BookQ7 book = new BookQ7(Integer.parseInt(tokens[0]),
						tokens[1]);
				bookList.add(book);
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList.toArray(new BookQ7[0]);
	}
}
