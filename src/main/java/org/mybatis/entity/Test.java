package org.mybatis.entity;

import java.io.Serializable;

public class Test implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String version;
	
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
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	

}
