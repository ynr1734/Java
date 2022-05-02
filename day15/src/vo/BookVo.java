package vo;

public class BookVo {
	private int id;
	private String name;
	private String author;
	private String isbn;
	private int status;
	
	public BookVo() {
	}
	
	public BookVo(String name, String author, String isbn, int status) {
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.status = status;
	}

	public BookVo(int id, String name, String author, String isbn, int status) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.isbn = isbn;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BookVo [id=" + id + ", name=" + name + ", author=" + author + ", isbn=" + isbn + ", status=" + status
				+ "]";
	}
	
	
}

