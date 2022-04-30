package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class SelectCust {

	public static void main(String[] args) {
		// JDBC (Java Database Connectivity) Program
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // ��û��� Ȯ�ο��� �ʿ��� ����
		String sql = "SELECT * FROM CUST WHERE id = ?"; // ��ҹ��� ���� �ʼ�
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // ���⸦ �� ã�� ���� ������ �����ϼ���~
			System.out.println("MySQL JDBC Driver Loading ... ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://192.168.219.104:3306/shopdb?serverTimezone=Asia/Seoul"; 
		// -> �����ͺ��̽��� ��ġ�Ǿ��ִ� ��ǻ�Ϳ� �����ϰڴ� // 127.0.0.1 -> �� ��ǻ�� ip
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected ...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		// SQL�� �̿��� ��û
		try {
			ps = con.prepareStatement(sql); 
			ps.setString(1, "id99");
			
			// ��û ����� Ȯ��
			rs = ps.executeQuery(); 
			// Insert,Delete,Update�� executeUpdate , Select�� executeQuery / ResultSet���� ��������
			rs.next(); // �ݵ�� Ű ����Ʈ�� �� ĭ�� �̵��ؼ� �����;��� (�׸� ����)
			
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			
			System.out.println(id+" "+pwd+" "+name);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// Close
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
