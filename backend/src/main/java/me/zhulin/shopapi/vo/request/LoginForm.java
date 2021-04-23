package me.zhulin.shopapi.vo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Created By Zhu Lin on 1/1/2019.
 */

public class LoginForm {
    
	@NotBlank
    private String username;
    @NotBlank
    private String password;
    public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginForm(@NotBlank String username, @NotBlank String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
    
}
}