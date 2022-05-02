package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import frame.Dao;
import frame.Sql;
import vo.BookVo;

public class BookDao<K> extends Dao<Integer, BookVo> {

	@Override
	public void insert(BookVo v) throws Exception {
		// Connection
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.insertbook);
			ps.setString(1, v.getName());
			ps.setString(2, v.getAuthor());
			ps.setString(3, v.getIsbn());
			ps.setInt(4, v.getStatus());
			
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("사용자 입력 오류");
		}finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void update0(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updatebook);
			ps.setInt(1, k);
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("사용자 입력 오류");
		}finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public void update1(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.updatebook);
			ps.setInt(1, k);
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("사용자 입력 오류");
		}finally {
			close(ps);
			close(con);
		}
	}

	@Override
	public void delete(Integer k) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.deletebook);
			ps.setInt(1, k);
			ps.executeUpdate();
		}catch(Exception e) {
			throw new Exception("사용자 입력 오류");
		}finally {
			close(ps);
			close(con);
		}
		
	}

	@Override
	public BookVo select(Integer k) throws Exception {
		BookVo b = null;

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectbook);
			ps.setInt(1, k);
			rs = ps.executeQuery();
			rs.next();
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String author = rs.getString("author");
			String isbn = rs.getString("isbn");
			int status = rs.getInt("status");
			b = new BookVo(id, name, author, isbn, status);
			
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}
		
		return b;
	}

	@Override
	public List<BookVo> select() throws Exception {
		List<BookVo> list = new ArrayList<BookVo>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(Sql.selectAllbook);
			rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String author = rs.getString("author");
				String isbn = rs.getString("isbn");
				int status = rs.getInt("status");
				BookVo b = new BookVo(id, name, author, isbn, status);
				list.add(b);
			}
		}catch(Exception e) {
			throw e;
		}finally {
			close(rs);
			close(ps);
			close(con);
		}

		return list;
	}

	

}
