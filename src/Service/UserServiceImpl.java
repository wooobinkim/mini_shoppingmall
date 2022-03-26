package Service;

import java.sql.SQLException;

import Dao.UserDao;
import Dao.UserDaoImpl;
import Dto.UserDto;

public class UserServiceImpl implements UserService{
	private UserDao uDao;
	public UserServiceImpl() {
		uDao = new UserDaoImpl();
	}
	@Override
	public UserDto login(String id, String password) throws SQLException {
		return uDao.login(id, password);
	}

	@Override
	public int regist(UserDto uDto) throws SQLException {
		return uDao.regist(uDto);
	}

	@Override
	public int update(UserDto uDto) throws SQLException {
		return uDao.update(uDto);
	}

	@Override
	public int delete(UserDto uDto) throws SQLException {
		return uDao.delete(uDto);
	}

}
