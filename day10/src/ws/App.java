package ws;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		DAO dao = new TodoDAO();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input cmd(i,d,u,s,a,q) ...");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("i")) {
				System.out.println("Write a To-do list.");
				
				System.out.println("Write an order");
				String num = sc.next();
				System.out.println("Write When: ");
				String when = sc.next();
				System.out.println("Write What: ");
				String what = sc.next();
				System.out.println("Continue or Done: ");
				String done = sc.next();
				
				TodoVO t = new TodoVO(num, when, what, done);
				dao.insert(t);
				
			}else if(cmd.equals("d")) {
				System.out.println("Input Customer id ..");
				String id = sc.next();
				dao.delete(id);
				
			}else if(cmd.equals("s")) {
				System.out.println("Input Customer id ..");
				String id = sc.next();
				TodoVO t = dao.select(id);
				System.out.println(t);
				
			}else if(cmd.equals("a")) {
				ArrayList<TodoVO> list = dao.select();
				for (TodoVO t : list) {
					System.out.println(t);
				}
			}else if(cmd.equals("u")) {
				System.out.println("Write When: ");
				String num = sc.next();
				System.out.println("Write When: ");
				String when = sc.next();
				System.out.println("Write What: ");
				String what = sc.next();
				System.out.println("Continue or Done: ");
				String done = sc.next();
				
				TodoVO t = new TodoVO(num, when, what, done);
				dao.update(t.getNum());
			}
		}
		sc.close();
		System.out.println("End ...");
	}


}
