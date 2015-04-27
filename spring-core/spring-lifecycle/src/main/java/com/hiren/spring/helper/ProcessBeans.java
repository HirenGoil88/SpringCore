package com.hiren.spring.helper;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ProcessBeans implements InitializingBean,DisposableBean{

	public void destroy() throws Exception {
		System.out.println("destroy method of DisposableBean interface called.");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set mthod of InitializingBean interface called.");
	}
	

}
