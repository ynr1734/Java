package ws;

import java.util.ArrayList;

public interface DAO {

	public default void connect() {
		System.out.println("To do list db list Connected ...");
	}
	public default void close() {
		System.out.println("To do list db list Closed ...");
	}
	public void insert(TodoVO t);
	public void delete(String id);
	public void update(String t);
	public TodoVO select(String id);
	public ArrayList<TodoVO> select();
}
