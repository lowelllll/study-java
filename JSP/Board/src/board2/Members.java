package board2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


public class Members {
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	private final String URL = "jdbc:mysql://localhost:3306/board";
	private final String ID = "root";
	private final String PW = "";
	
	public Members () {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL,ID,PW);
			
			stmt = conn.createStatement();
			System.out.println("db ���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean register (String id,String pw) {
		boolean flag = false;
		
		try {
			rs = stmt.executeQuery("SELECT * FROM members WHERE id = '"+id+"'"); // ���̵� �ߺ� �˻�
			if (rs.next()) {
				return flag;
			}
			stmt.executeUpdate("INSERT INTO members (id,pw) VALUES ('"+id+"', '"+pw+"')"); // ȸ������
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return flag;
		}
	}
	
}
