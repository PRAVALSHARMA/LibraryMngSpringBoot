package com.example.demo;

import java.io.Serializable;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BooK")
public class Book implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@Column(name="Auther" ,length=20)
	public String auther;
	
	@Column(name="Name" , length=20)
	public String name;

	public int getId() {
		System.out.println("getting id");
		return id;
	}

	public void setId(int id) {
		System.out.println("detting id");
		this.id = id;
	}

	public String getAuther() {
		System.out.println("getting auther");
		return auther;
	}

	public void setAuther(String auther) {
		System.out.println("detting suther");
		this.auther = auther;
	}

	public String getName() {
		System.out.println("getting name");
		return name;
	}

	public void setName(String name) {
		System.out.println("detting name");
		this.name = name;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", auther=" + auther + ", name=" + name + "]";
	}

	
	
	

}

