package com.proyecto.ecommerce.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String username;
	private String email;
	private String address;
	private String telephone;
	private String usertype;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<product> products;
	
	@OneToMany(mappedBy = "user")
	private List<order> orders;
	
	public user() {
	}
	
	public user(Integer id, String name, String username, String email, String address, String telephone,
			String usertype, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.telephone = telephone;
		this.usertype = usertype;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	@OneToMany(mappedBy = "usuario")
	public List<product> getProducts() {
		return products;
	}

	@OneToMany(mappedBy = "usuario")
	public List<order> getOrders() {
		return orders;
	}

	public void setOrders(List<order> orders) {
		this.orders = orders;
	}

	public void setProducts(List<product> products) {
		this.products = products;
	}

	
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ", address="
				+ address + ", telephone=" + telephone + ", usertype=" + usertype + ", password=" + password + "]";
	}	
}
