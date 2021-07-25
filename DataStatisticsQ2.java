package Data;

public class DataStatisticsQ2 {

	public static void main(String[] args) {

		Book[] books = CSVLoader.bookLoader("data\\Book3.csv");
		Book book = null;
		int count = 0;

		// Find books with ID multiple of 100
		for (int i = 0; i < books.length; i++) {
			book = books[i];
			if (book.GetID() % 100 == 0) {
				// Add to counter if value is null or -1 (-1 represents null
				// values for failed parsing - see CSVLoader)
				if (book.GetID() == -1) {
					count++;
				}
				if (book.GetTitle() == null) {
					count++;
				}
				if (book.GetAuthor1() == null) {
					count++;
				}
				if (book.GetAuthor2() == null) {
					count++;
				}
				if (book.GetAuthor3() == null) {
					count++;
				}
				if (book.GetPublisher() == null) {
					count++;
				}
				if (book.GetIsbn13() == -1) {
					count++;
				}
				if (book.GetDate() == null) {
					count++;
				}
				if (book.GetPages() == -1) {
					count++;
				}
				if (book.GetDimensions() == null) {
					count++;
				}
				if (book.GetRank() == -1) {
					count++;
				}
				if (book.GetRatingsCount() == -1) {
					count++;
				}
				if (book.GetRatingsValue() == -1) {
					count++;
				}
				if (book.GetPaperback() == null) {
					count++;
				}
				if (book.GetHardback() == null) {
					count++;
				}
				if (book.GetEbook() == null) {
					count++;
				}
				if (book.GetAudiobook() == null) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
