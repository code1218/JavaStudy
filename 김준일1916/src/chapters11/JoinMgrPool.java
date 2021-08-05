package chapters11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnectionMgr;

public class JoinMgrPool {
	DBConnectionMgr pool = null;
	
	public JoinMgrPool() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean idCheck(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "select user_id from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next() && rs.getString(1) != null) {
				flag = true;
			}
		}catch(SQLException sqlEx) {
			System.out.println(sqlEx);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return flag;
	}
	
	public boolean joinSubmit(UserBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "insert into user_mst values(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getUser_id());
			pstmt.setString(2, bean.getUser_pwd());
			pstmt.setString(3, bean.getUser_name());
			pstmt.setString(4, bean.getUser_phone());
			pstmt.executeUpdate();
			flag = true;
		}catch(SQLException sqlEx) {
			System.out.println(sqlEx);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt);
		}
		
		return flag;
	}
}
