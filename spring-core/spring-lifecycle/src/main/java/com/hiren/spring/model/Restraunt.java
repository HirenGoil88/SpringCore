package com.hiren.spring.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Restraunt implements DisposableBean,InitializingBean {
	
	private long id;
	private String name;
	private int phoneNumber;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}
	

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Restraunt() {
		System.out.println("Class instantiated");
	}
	
	public void greetCustomer(){
		System.out.println("Welcome dear customer");
	}
	
	public void init(){
		System.out.println("init method called");
		this.name = "Sankalp";
	}
	
	public void destroy(){
		System.out.println("destroy method called");
	}
	
	@PostConstruct
	public void postConstructInit(){
		System.out.println("postConstruct method called.");
	}
	
	@PreDestroy
	public void preDestroy(){
		System.out.println("preDestroy method called.");
	}
	
	public String toString(){
		
		return "name : "+ this.name+ " phone number : "+this.phoneNumber;
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method called");
		
	}
	
	
}
