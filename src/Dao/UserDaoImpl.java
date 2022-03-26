package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.UserDto;
import Util.DBUtil;

public class UserDaoImpl implements UserDao{

	@Override
	public UserDto login(String id, String password) throws SQLException {
		
		Connection conn = DBUtil.getConnection();
		String sql = "select userid, userpwd, username, useraddress from user where userid = ? and userpwd = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		ResultSet rs = pstmt.executeQuery();
		UserDto uDto=null;
		if(rs.next()) {
			uDto = new UserDto(
						rs.getString("userid"),
						rs.getString("userpwd"),
						rs.getString("username"),
						rs.getString("useraddress")
				);
		}
		return uDto;
	}

	@Override
	public int regist(UserDto uDto) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "insert into user values(?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uDto.getUserid());
		pstmt.setString(2, uDto.getUserpwd());
		pstmt.setString(3, uDto.getUsername());
		pstmt.setString(4, uDto.getUseraddress());
		return pstmt.executeUpdate();
	}


	@Override
	public int update(UserDto uDto) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "update user set userpwd=?, username=?, useraddress=? where userid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uDto.getUserpwd());
		pstmt.setString(2, uDto.getUsername());
		pstmt.setString(3, uDto.getUseraddress());
		pstmt.setString(4, uDto.getUserid());
		return pstmt.executeUpdate();
	}

	@Override
	public int delete(UserDto uDto) throws SQLException {
		Connection conn = DBUtil.getConnection();
		String sql = "delete from user where userid=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, uDto.getUserid());
		return pstmt.executeUpdate();
	}

}
