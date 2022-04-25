package ws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class TodoDAO implements DAO, Search {

	HashMap<String, TodoVO> map;
	
	public TodoDAO() {
		map = new HashMap<String, TodoVO>();
	}
	
	
	@Override
	public void insert(TodoVO t) {
		String key = t.getNum();
		map.put(key, t);

	}

	@Override
	public void delete(String id) {
		map.remove(id);

	}
	
	public void update(String id) {
        // 해당 ID는 완료처리해서 true값으로 바꾸어줌.
        TodoVO t = null;
        t = map.get(id);    
        t.setDone("done");
    }
		
	@Override
	public TodoVO select(String id) {
		TodoVO t = null;
		t = map.get(id);
		return null;
	}

	@Override
	public ArrayList<TodoVO> select() {
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
    public ArrayList<TodoVO> search(String done) {
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
