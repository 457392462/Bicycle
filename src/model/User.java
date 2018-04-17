package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")//数据库里的users表
public class User {
	
	@Id
	private int UserID;//主键
	@Column
	private String UserName;
	@Column
	private String Password;
	
	public int getId() {
		return UserID;
	}
	public void setId(int id) {
		this.UserID = id;
	}

	public String getName() {
		return UserName;
	}
	public void setName(String name) {
		this.UserName = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	@Override
	public String toString() {
		return "athlete [UserID=" + UserID + ", UserName=" + UserName + ", Password=" + Password + "]";
	}
	
	
}
