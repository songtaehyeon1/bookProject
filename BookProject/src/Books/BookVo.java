package Books;

public class BookVo {

	private String bookName;
	private String chul;
	private String name;
	private String genre;
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getChul() {
		return chul;
	}

	public void setChul(String chul) {
		this.chul = chul;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public BookVo(String bookName, String chul, String name, String genre) {
		this.bookName = bookName;
		this.chul = chul;
		this.name = name;
		this.genre = genre;
	}
	
	public BookVo() {
		
	}


}
