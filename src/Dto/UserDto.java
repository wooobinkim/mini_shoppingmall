package Dto;

public class UserDto {
	private String userid;
	private String userpwd;
	private String username;
	private String useraddress;
	public UserDto(String userid, String userpwd, String username, String useraddress) {
		super();
		this.userid = userid;
		this.userpwd = userpwd;
		this.username = username;
		this.useraddress = useraddress;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	@Override
	public String toString() {
		return "UserDto [userid=" + userid + ", userpwd=" + userpwd + ", username=" + username + ", useraddress="
				+ useraddress + "]";
	}

	
}
