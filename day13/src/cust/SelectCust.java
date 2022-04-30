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
		
		// 변수 선언
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // 요청결과 확인에서 필요한 변수
		String sql = "SELECT * FROM CUST WHERE id = ?"; // 대소문자 구분 필수
		
		// MySQL JDBC Driver Loading
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 여기를 못 찾을 수도 있으니 조심하세요~
			System.out.println("MySQL JDBC Driver Loading ... ");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// MySQL Connect
		String url = "jdbc:mysql://192.168.219.104:3306/shopdb?serverTimezone=Asia/Seoul"; 
		// -> 데이터베이스가 설치되어있는 컴퓨터에 연결하겠다 // 127.0.0.1 -> 내 컴퓨터 ip
		String mid = "admin1";
		String mpwd = "111111";
		try {
			con = DriverManager.getConnection(url,mid,mpwd);
			System.out.println("MySQL Server Connected ...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
		// SQL을 이용한 요청
		try {
			ps = con.prepareStatement(sql); 
			ps.setString(1, "id99");
			
			// 요청 결과를 확인
			rs = ps.executeQuery(); 
			// Insert,Delete,Update는 executeUpdate , Select는 executeQuery / ResultSet으로 가져오기
			rs.next(); // 반드시 키 포인트를 한 칸을 이동해서 가져와야함 (그림 참조)
			
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
