package shoppingmall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	// create user
	public boolean createUser(String custname,String phone,String address,String joindate,String grade,String city) {
		boolean flag = true;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("INSERT INTO member_tbl_02 VALUES (seq2.NEXTVAL,?,?,?,?,?,?)");
			pstmt.setString(1, custname);
			pstmt.setString(2, phone);
			pstmt.setString(3, address);
			pstmt.setString(4, joindate);
			pstmt.setString(5, grade);
			pstmt.setString(6, city);
			pstmt.executeQuery();
			
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return flag;
		}
	}
	
	// select custno 
	public ResultSet selectCustno() {
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT (MAX(custno)+1) FROM member_tbl_02");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return rs;
		}
	}
	
	public ResultSet userList () {
		String query = "SELECT custno, custname, phone, address,TO_CHAR(joindate,'YYYY-MM-DD'),grade,city FROM member_tbl_02 ORDER BY custno ASC";
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return rs;
		}
	}
	
	public ResultSet getUser (String custno) {
		String query = "SELECT custno, custname, phone, address,TO_CHAR(joindate,'YYYY-MM-DD'),grade,city  FROM member_tbl_02 WHERE custno = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(custno));
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return rs;
		}
	}
	
	public boolean updateUser (String custname,String phone,String address,String joindate,String grade,String city,String custno) {
		boolean flag = false;
		String query = "UPDATE member_tbl_02 SET custname =?,phone = ?, address=?, joindate=?,grade=?,city=? WHERE custno = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, custname);
			pstmt.setString(2, phone);
			pstmt.setString(3, address);
			pstmt.setString(4, joindate);
			pstmt.setString(5, grade);
			pstmt.setString(6, city);
			pstmt.setInt(7, Integer.parseInt(custno));
			pstmt.executeQuery();
			
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return flag;
		}
	}
}
