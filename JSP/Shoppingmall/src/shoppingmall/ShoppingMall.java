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
	
	public ShoppingMall () {
		try {
			conn = getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","hr","hr");
		return con;
	}
	
	public boolean createUser(String name,String tel,String address,String joindate,String grade,String code) {
		boolean flag = false;
		String query = "INSERT INTO member_tbl_02 values(seq.NEXTVAL,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, address);
			pstmt.setString(4, joindate);
			pstmt.setString(5, grade);
			pstmt.setString(6,code);
			
			pstmt.executeUpdate();
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return flag;
		}
	}
	
	public boolean updateUser(String custno, String name,String tel,String address,String joindate,String grade,String code) {
		boolean flag = false;
		String query = "UPDATE member_tbl_02 SET custname = ?, phone =?, address=?, joindate=?, grade=?,city=? where custno = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(3, address);
			pstmt.setString(4, joindate);
			pstmt.setString(5, grade);
			pstmt.setString(6,code);
			pstmt.setInt(7, Integer.parseInt(custno));
			pstmt.executeUpdate();
			
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return flag;
		}
	}
	
	public ResultSet getUserList () {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT custno,custname,phone,address,TO_CHAR(joindate,'YYYY-MM-DD'),grade,city FROM member_tbl_02 ORDER BY custno ASC");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return rs;
		}
	}
	
	public int getCustno () {
		int result = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT (MAX(custno))+1 FROM member_tbl_02");
			
			if(rs.next()) {
				result = rs.getInt(1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return result;
		}
	}
	
	public ResultSet getPrice () {
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT member.custno, member.custname, member.grade,money.price FROM member_tbl_02 member, (SELECT custno,sum(price) price FROM money_tbl_02 GROUP BY custno) money WHERE member.custno = money.custno ORDER BY price desc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return rs;
		}
	}
	
	public ResultSet getUser (String custno) {
		try {
			pstmt = conn.prepareStatement("select * from member_tbl_02 where custno = ?");
			pstmt.setInt(1, Integer.parseInt(custno));
			rs = pstmt.executeQuery();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return rs;
		}
	}
}
