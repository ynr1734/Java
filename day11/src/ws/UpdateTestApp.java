package ws;

public class UpdateTestApp {

	public static void main(String[] args) {
		DAO dao = new TodoDAO();
		TodoVO t1 = new TodoVO("1", "Today", "Review", "Done");
		
		try {
			dao.update(t1.getNum()); // ��Ʈ�� ���� �������� ���ؼ� getNum.
			System.out.println("Complated 1 ..");
			dao.update(t1.getNum());
			System.out.println("Complated 2 ..");
		}catch (NotFoundKEYException e) {
			System.out.println(e.getMessage());
		}
	}

}
