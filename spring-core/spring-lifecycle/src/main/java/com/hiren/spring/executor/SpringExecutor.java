package com.hiren.spring.executor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hiren.spring.model.Restraunt;

public class SpringExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Restraunt restraunt = context.getBean(Restraunt.class);
		System.out.println(restraunt.toString());
		((AbstractApplicationContext)context).registerShutdownHook();
		restraunt.greetCustomer();
	}

}
