package shoppingmall;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Statement;

public class ShoppingMall {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;

	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
		return con;
	}
	
	public boolean createUser(String name,String tel,String address,String joindate,String grade,String code) {
		boolean flag = false;
		String query = createQuery(name,tel,address,joindate,grade,code);
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return flag;
		}
	}

	private String createQuery(String name,String tel,String address,String joindate,String grade,String code) {
		StringBuilder query = new StringBuilder("insert into member_tbl_02 values (seq.NEXTVAL,'");
		query.append(name);
		query.append("','");
		query.append(tel);
		query.append("','");
		query.append(address);
		query.append("','");
		query.append(joindate);
		query.append("','");
		query.append(grade);
		query.append("','");
		query.append(code);
		query.append("')");
		
		return query.toString();
	}
	
	public ResultSet selectUser() {
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member_tbl_02");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return rs;
		}
	}
}
