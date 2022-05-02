package frame;

public class Sql {
	public static String insertbook = "INSERT INTO BOOK VALUES (NULL,?,?,?,?)";
	public static String deletebook = "DELETE FROM BOOK WHERE id=?";
	public static String updatebook = "UPDATE BOOK SET status WHERE id=?";
	public static String selectbook = "SELECT * FROM BOOK WHERE id =?";
	public static String selectAllbook = "SELECT * FROM BOOK";
	
}
