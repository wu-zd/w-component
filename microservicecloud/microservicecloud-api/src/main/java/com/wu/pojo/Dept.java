package com.wu.pojo;

public class Dept {
	private  int id;
	private String name;
	private String db_source;
	
	public Dept() {
		super();
	}

	public Dept(int id, String name, String db_source) {
		super();
		this.id = id;
		this.name = name;
		this.db_source = db_source;
	}

	public Dept(String name, String db_source) {
		super();
		this.name = name;
		this.db_source = db_source;
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

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

}
