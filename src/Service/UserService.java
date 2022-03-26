package Service;

import java.sql.SQLException;

import Dto.UserDto;

public interface UserService {
	public UserDto login(String id, String password) throws SQLException;
	public int regist(UserDto uDto) throws SQLException;
	public int update(UserDto uDto) throws SQLException;
	public int delete(UserDto uDto) throws SQLException;
}
