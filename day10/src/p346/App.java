package p346;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Start ...");
		OracleDAO oracle = new OracleDAO();
		// CRUD
		DAO dao = oracle; 		// 꼈다가 뺐다가 하는 곳 
								// Search가 안되었던 이유 : 인터페이스가 둘 다 new라서 
								// 저장공간이 각각 생겨서 위에 add
		// Search
		Search search = new OracleDAO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input cmd(i,d,u,s,a,c,q) ...");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
				
			}else if(cmd.equals("i")) {
				System.out.println("Input Customer info ..");
				System.out.println("Input Customer id ..");
				String id = sc.next();
				System.out.println("Input Customer pwd ..");
				String pwd = sc.next();
				System.out.println("Input Customer name ..");
				String name = sc.next();
				
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.insert(c);
				
			}else if(cmd.equals("d")) {
				System.out.println("Input Customer id ..");
				String id = sc.next();
				dao.delete(id);
				
			}else if(cmd.equals("c")) {
				System.out.println("Input Customer name ..");
				String name = sc.next();
				
				ArrayList<CustomerVO> list = search.search(name);
				for (CustomerVO c : list) {
					System.out.println(c);
				}
				
			}else if(cmd.equals("s")) {
				System.out.println("Input Customer id ..");
				String id = sc.next();
				CustomerVO c = dao.select(id);
				System.out.println(c);
				
			}else if(cmd.equals("a")) {
				ArrayList<CustomerVO> list = dao.select();
				for (CustomerVO c : list) {
					System.out.println(c);
				}
			}else if(cmd.equals("u")) {
				System.out.println("Input Customer id ..");
				String id = sc.next();
				System.out.println("Input Customer pwd ..");
				String pwd = sc.next();
				System.out.println("Input Customer name ..");
				String name = sc.next();
				
				CustomerVO c = new CustomerVO(id, pwd, name);
				dao.update(c);
			}
		}
		sc.close();
		System.out.println("End ...");
	}

}
