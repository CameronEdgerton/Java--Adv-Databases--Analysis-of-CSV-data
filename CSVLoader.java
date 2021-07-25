package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVLoader {
	
	public static Book[] bookLoader(String filePath) {
		List<Book> bookList = new ArrayList<Book>();
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
				int zero;
				long six;
				int eight;
				int ten;
				int eleven;
				double twelve;

				// Set empty cells to null
				for (int i = 0; i < tokens.length ; i++) {
					if (tokens[i].isEmpty() || tokens[i] == "") {
						tokens[i] = null;
					}
				}

				// Set common value for cells that are unable to be parsed to
				// int, double or long. These will be treated as identifiers
				// for null values
				if (tokens[0] == null) {
					zero = -1;
				} else {
					zero = Integer.parseInt(tokens[0]);
				}

				if (tokens[6] == null) {
					six = -1;
				} else {
					six = Long.parseLong(tokens[6]);
				}

				if (tokens[8] == null) {
					eight = -1;
				} else {
					eight = Integer.parseInt(tokens[8]);
				}

				if (tokens[10] == null) {
					ten = -1;
				} else {
					ten = Integer.parseInt(tokens[10]);
				}

				if (tokens[11] == null) {
					eleven = -1;
				} else {
					eleven = Integer.parseInt(tokens[11]);
				}

				if (tokens[12] == null) {
					twelve = -1;
				} else {
					twelve = Double.parseDouble(tokens[12]);
				}


				Book book = new Book(zero,
						tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]
						, six, tokens[7],
						eight,
						tokens[9], ten,
						eleven,
						twelve, tokens[13]
						, tokens[14], tokens[15], tokens[16]);
				bookList.add(book);
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList.toArray(new Book[0]);
	}
}
