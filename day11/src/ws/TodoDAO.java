package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import oracle.DuplicatedIDException;
import oracle.NotFoundException;

public class TodoDAO implements DAO, Search {

	HashMap<String, TodoVO> map;
	
	public TodoDAO() {
		map = new HashMap<String, TodoVO>();
	}
	
	
	@Override
	public void insert(TodoVO t) throws DuplicatedKEYException {
		String key = t.getNum();
		 if(map.containsKey(key)) {
	            throw new DuplicatedKEYException("KEY �ߺ��Դϴ�!");
		 }
	     map.put(key, t);

	}
		 
	@Override
	public void delete(String num) throws NotFoundKEYException {
		if(!map.containsKey(num)) {
    		throw new NotFoundKEYException("KEY�� �������� �ʽ��ϴ�!");
    	}
		map.remove(num);

	}
	
	public void update(String num) throws NotFoundKEYException {
        TodoVO t = null;
        t = map.get(num); 
        if(!map.containsKey(t.getNum())) {
            throw new NotFoundKEYException("KEY�� �������� �ʽ��ϴ�!");
        }
        t.setDone("done");
    }
		
	@Override
	// select : key ���� ���� �ϳ��� ������� 
	// ArraySelect : ��� ���� ��ü�� �������
	// search : ���� ���ϴ� ����(continue)�� ��� ������ �������
	public TodoVO select(String num) throws NotFoundKEYException {
		TodoVO t = null;
		t = map.get(num);
		if(!map.containsKey(t.getNum())) {
            throw new NotFoundKEYException("KEY�� �������� �ʽ��ϴ�!");
        }
		return null;
	}

	@Override
	public ArrayList<TodoVO> select() throws NotFoundKEYException {
		Collection<TodoVO> col = map.values();
		Iterator<TodoVO> it = col.iterator();
		
		ArrayList<TodoVO> list = new ArrayList<>();
		while(it.hasNext()) {
			TodoVO todost = it.next();
			list.add(todost);
		}
		return list;
		
	}
	
	@Override
    public ArrayList<TodoVO> search(String done)  { // search���� ���ܰ� �ʿ����� 
        ArrayList<TodoVO> list = new ArrayList<TodoVO>();
        
        Collection<TodoVO> col = map.values();
        Iterator<TodoVO> it = col.iterator();

        while(it.hasNext()) {
        	TodoVO cust = it.next();
            if(cust.getDone() == done) {
                list.add(cust);
            }
        }
        
        return list;
    }


}
