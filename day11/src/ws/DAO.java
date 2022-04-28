package ws;

import java.util.ArrayList;

public interface DAO {

	public default void connect() {
		System.out.println("To do list db list Connected ...");
	}
	public default void close() {
		System.out.println("To do list db list Closed ...");
	}
	public void insert(TodoVO t) throws DuplicatedKEYException;
	public void delete(String num) throws NotFoundKEYException;
	public void update(String num) throws NotFoundKEYException;
	public TodoVO select(String num) throws NotFoundKEYException;
	public ArrayList<TodoVO> select() throws NotFoundKEYException;
}
