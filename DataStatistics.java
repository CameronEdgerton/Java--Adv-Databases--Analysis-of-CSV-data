package Data;


public class DataStatistics {

	public static void main(String[] args) {

		Book[] books = CSVLoader.bookLoader("data\\Book3.csv");
		Book book = null;
		int count = 0;

		// Add to the count each time a row's id is a multiple of 100
		for (int i = 0; i < books.length ; i++) {
			book = books[i];
			if (book.GetID() % 100 == 0) {
				count++;
			}
		}

		System.out.println(count);
		
	}
}
