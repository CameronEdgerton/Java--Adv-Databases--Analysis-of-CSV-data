package Data;

public class Book {

	private int id;
	private String title;
	private String author1;
	private String author2;
	private String author3;
	private String publisher;
	private long isbn13;
	private String date;
	private int pages;
	private String dimensions;
	private int rank;
	private int ratingsCount;
	private double ratingsValue;
	private String paperback;
	private String hardback;
	private String ebook;
	private String audiobook;


	
	public Book (int id, String title, String author1, String author2,
					   String author3, String publisher, long isbn13,
					   String date, int pages, String dimensions, int rank,
					   int ratingsCount, double ratingsValue, String paperback,
					   String hardback, String ebook, String audiobook) {
		this.id = id;
		this.title = title;
		this.author1 = author1;
		this.author2 = author2;
		this.author3 = author3;
		this.publisher = publisher;
		this.isbn13 = isbn13;
		this.date = date;
		this.pages = pages;
		this.dimensions = dimensions;
		this.rank = rank;
		this.ratingsCount = ratingsCount;
		this.ratingsValue = ratingsValue;
		this.paperback = paperback;
		this.hardback = hardback;
		this.ebook = ebook;
		this.audiobook = audiobook;

	}

	public int GetID() {
		return id;
	}

	public void SetID(int id) {
		this.id = id;
	}

	public String GetTitle() {
		return title;
	}

	public void SetTitle(String title) {
		this.title = title;
	}

	public String GetAuthor1() {
		return author1;
	}

	public void SetAuthor1(String author1) {
		this.author1 = author1;
	}

	public String GetAuthor2() {
		return author2;
	}

	public void SetAuthor2(String author2) {
		this.author2 = author2;
	}

	public String GetAuthor3() {
		return author3;
	}

	public void SetAuthor3(String author3) {
		this.author3 = author3;
	}

	public String GetPublisher() {
		return publisher;
	}

	public void SetPublisher(String publisher) {
		this.publisher = publisher;
	}

	public long GetIsbn13() {
		return isbn13;
	}

	public void SetIsbn13(long isbn13) {
		this.isbn13 = isbn13;
	}

	public String GetDate() {
		return date;
	}

	public void SetDate(String date) {
		this.date = date;
	}

	public int GetPages() {
		return pages;
	}

	public void SetPages(int pages) {
		this.pages = pages;
	}

	public String GetDimensions() {
		return dimensions;
	}

	public void SetDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public int GetRank() {
		return rank;
	}

	public void SetRank(int rank) {
		this.rank = rank;
	}

	public int GetRatingsCount() {
		return ratingsCount;
	}

	public void SetRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public double GetRatingsValue() {
		return ratingsValue;
	}

	public void SetRatingsValue(double ratingsValue) {
		this.ratingsValue = ratingsValue;
	}

	public String GetPaperback() {
		return paperback;
	}

	public void SetPaperback(String paperback) {
		this.paperback = paperback;
	}

	public String GetHardback() {
		return hardback;
	}

	public void SetHardback(String hardback) {
		this.hardback = hardback;
	}

	public String GetEbook() {
		return ebook;
	}

	public void SetEbook(String ebook) {
		this.ebook = ebook;
	}

	public String GetAudiobook() {
		return audiobook;
	}

	public void SetAudiobook(String audiobook) {
		this.audiobook = audiobook;
	}


}
