package com.wu.pojo;

import java.io.Serializable;

public class Users implements Serializable{
private int id;
private String name;
private String sex;
private int age;
private String di;
private String qq;
private String email;
public Users() {
	super();
}
public Users(int id, String name, String sex, int age, String di, String qq, String email) {
	super();
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.di = di;
	this.qq = qq;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDi() {
	return di;
}
public void setDi(String di) {
	this.di = di;
}
public String getQq() {
	return qq;
}
public void setQq(String qq) {
	this.qq = qq;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
