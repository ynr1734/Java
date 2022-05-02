package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

import dao.BookDao;
import frame.Dao;
import vo.BookVo;

// ó���� ���̵� �Է� 
// �ι�° ����Ʈ���� �� å�� �����ְ� 
// �� �ؿ� �� ��ư�� ������ ����Ʈ���� ���� �� �����ְ�
// ����° �ؽ�Ʈ �ڽ����� ���̵� �Է��ϸ� �뿩 or �ݳ� ���� 


public class UI {

	Dao<Integer, BookVo> dao;
	java.util.List<BookVo> blist;
	
	Frame f;
	Button b1, b2;
	Panel p1, p2;
	Panel main;
	TextField tf1, tf2, tf3;
	TextField maintf;
	List list;
	
	public UI() {
		dao = new BookDao();
		init();
		make();
		addEvent();
	}
	
	public void init() {
		f = new Frame("My Frame");
		b1 = new Button("ADD");
		b2 = new Button("�뿩");
		b3 = new Button("�ݳ�");
		p1 = new Panel();
		p2 = new Panel();
		main = new Panel();
		maintf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		list = new List();
	}
	
	public void make() {
		p1.setBackground(Color.WHITE);
		p2.setBackground(Color.YELLOW);
		
		p2.setLayout(new BorderLayout());
		p2.add(list, "Center");
		p2.add(b2, "South");
		
		p1.setLayout(new GridLayout(6,1));
		p1.add(tf1);
		p1.add(tf2);
		p1.add(tf3);
		p1.add(b1);
		
		main.setLayout(new GridLayout(1,2));
		main.add(p1);
		main.add(p2);
		
		f.add(main, "Center");
		f.add(maintf, "South");
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public void addEvent() {
		
	}
	
	
	
	
}
