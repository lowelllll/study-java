package enrolemnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Db {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private Connection getConnection() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
				
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	public ResultSet getSubjectList() { // 교과목 목록
		String sql = "SELECT c.id, c.name, c.credit, l.name, c.week, TO_CHAR(c.start_hour,'0000'), TO_CHAR(c.end_end,'0000') FROM course_tbl c , lecturer_tbl l WHERE c.lecturer = l.idx ORDER BY id"; // JOIN
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return rs;
		}
	}
	
	public int getListCount() { // 현재 교과목 개수를 구함.
		String sql = "SELECT count(*) from (SELECT c.id, c.name, c.credit, l.name, c.week, c.start_hour,c.end_end FROM course_tbl c , lecturer_tbl l WHERE c.lecturer = l.idx)"; // JOIN
		int count = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return count;
		}
	}
	
	public ResultSet getLecturer() { // 강사 목록을 구함.
		String sql = "SELECT name FROM lecturer_tbl ORDER BY idx ASC";
		PreparedStatement tstmt = null;
		try {
			conn = getConnection();
			tstmt = conn.prepareStatement(sql);
			rs = tstmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return rs;
		}
	}
	
	public boolean createSubject(String id,String name,String credit,String lecturer,String week,String start_hour,String end) { // 교과목 추가
		boolean result = false;
		String sql = "INSERT INTO course_tbl VALUES (?,?,?,?,?,?,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2, name);
			pstmt.setInt(3, Integer.parseInt(credit));
			pstmt.setString(4, lecturer);
			pstmt.setInt(5, Integer.parseInt(week));
			pstmt.setInt(6, Integer.parseInt(start_hour));
			pstmt.setInt(7, Integer.parseInt(end));
			
			pstmt.executeQuery();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return result;
		}
	}
	
	public ResultSet getSubject(String id) { // 교과목 정보 조회
		String sql = "SELECT id, name, credit, week,TO_CHAR(start_hour,'0000'), TO_CHAR(end_end,'0000') , lecturer FROM course_tbl WHERE id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return rs;
		}
	}
	
	public boolean updateSubject(String id,String name,String credit,String lecturer,String week,String start_hour,String end) { // 교과목 정보 수정
		boolean result = false;
		String sql = "UPDATE course_tbl SET name = ?, credit = ?, lecturer= ?, week =?, start_hour = ?, end_end = ? WHERE id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(credit));
			pstmt.setString(3, lecturer);
			pstmt.setInt(4, Integer.parseInt(week));
			pstmt.setInt(5, Integer.parseInt(start_hour.trim()));
			pstmt.setInt(6, Integer.parseInt(end.trim()));
			pstmt.setString(7,id);
			pstmt.executeQuery();
			
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return result;
		}
	}
	
	public boolean deleteSubject(String id) { // 교과목 정보 삭제
		boolean result = false;
		String sql = "DELETE FROM course_tbl WHERE id = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeQuery();
			result = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return result;
		}
	}
}
