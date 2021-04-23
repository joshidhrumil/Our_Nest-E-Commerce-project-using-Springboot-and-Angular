package me.zhulin.shopapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created By Zhu Lin on 3/12/2018.
 */
@Entity

@Table(name = "users")

public class User implements Serializable {

    private static final long serialVersionUID = 4887904943282174032L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NaturalId
    @NotEmpty
    private String email;
    @NotEmpty
    @Size(min = 3, message = "Length must be more than 3")
    private String password;
    @NotEmpty
    private String name;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String address;
    @NotNull
    private boolean active;
    @NotEmpty
    private String role = "ROLE_CUSTOMER";

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore  // fix bi-direction toString() recursion problem
    private Cart cart;




    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", active=" + active +
                ", role='" + role + '\'' +
                '}';
    }




	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public User(Long id, @NotEmpty String email,
			@NotEmpty @Size(min = 3, message = "Length must be more than 3") String password, @NotEmpty String name,
			@NotEmpty String phone, @NotEmpty String address, @NotNull boolean active, @NotEmpty String role,
			Cart cart) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.active = active;
		this.role = role;
		this.cart = cart;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public boolean isActive() {
		return active;
	}




	public void setActive(boolean active) {
		this.active = active;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public Cart getCart() {
		return cart;
	}




	public void setCart(Cart cart) {
		this.cart = cart;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

