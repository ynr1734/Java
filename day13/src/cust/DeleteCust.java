package cust;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCust {

	public static void main(String[] args) {
		// JDBC (Java Database Connectivity) Program
		
		// ���� ����
		Connection con = null;
		PreparedStatement ps = null;
		String sql = "DELETE FROM CUST WHERE id = ?"; // ��ҹ��� ���� �ʼ�
		
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
			ps.setString(1, "id05");
			// ��û ����� Ȯ��
			int result = ps.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// Close
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
