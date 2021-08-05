package chapters11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnectionMgr;

public class UserMgrPool {
	DBConnectionMgr pool = null;
	
	public UserMgrPool() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public boolean loginCheck(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		
		try {
			con = pool.getConnection();
			sql = "select user_id, user_pwd from user_mst where user_id = ? and user_pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String user_id = rs.getString(1);
				String user_pwd = rs.getString(2);
				if(user_id != null && user_pwd != null) {
					flag = true;
				}
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
	
	public UserBean getUserBean(String id, String pwd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		boolean flag = false;
		
		UserBean bean = new UserBean();
		
		try {
			con = pool.getConnection();
			sql = "select * from user_mst where user_id = ? and user_pwd = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				bean.setUser_id(rs.getString(1));
				bean.setUser_pwd(rs.getString(2));
				bean.setUser_name(rs.getString(3));
				bean.setUser_phone(rs.getString(4));
			}
		}catch(SQLException sqlEx) {
			System.out.println(sqlEx);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return bean;
	}

}







