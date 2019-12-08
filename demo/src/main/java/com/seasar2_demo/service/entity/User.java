package com.seasar2_demo.service.entity;

import java.io.Serializable;

import org.seasar.dao.annotation.tiger.Bean;
import org.seasar.dao.annotation.tiger.Column;

@Bean(table="USER")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private Integer id;
	private String nickname;
	private String password;
	private Integer sex;
	private Integer age;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", id=" + id + ", nickname=" + nickname + ", password=" + password
				+ ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
