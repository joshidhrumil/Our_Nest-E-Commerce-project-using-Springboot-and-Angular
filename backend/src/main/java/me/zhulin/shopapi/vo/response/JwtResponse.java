package me.zhulin.shopapi.vo.response;

import lombok.Data;

/**
 * Created By Zhu Lin on 1/1/2019.
 */
@Data
public class JwtResponse {
    public JwtResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String token;
    private String type = "Bearer";
    private String account;
    private String name;
    private String role;

    public JwtResponse(String token, String account, String name, String role) {
        this.account = account;
        this.name = name;
        this.token = token;
        this.role = role;
    }

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
