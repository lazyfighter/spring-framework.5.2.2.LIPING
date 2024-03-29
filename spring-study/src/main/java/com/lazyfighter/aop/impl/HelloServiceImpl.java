package com.lazyfighter.aop.impl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("test1")
public class HelloServiceImpl implements InitializingBean {

	@Autowired
	private HelloServiceImpl2 helloServiceImpl2;

	public void sayHi() {
		System.out.println(helloServiceImpl2);
		System.out.println("hi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
	}
}
