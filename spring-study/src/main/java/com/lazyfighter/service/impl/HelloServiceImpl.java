package com.lazyfighter.service.impl;

import com.lazyfighter.service.CircularService;
import com.lazyfighter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liping
 */
@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private CircularService circularService;

	@Override
	public String sayHello(String name) {
		System.out.println(circularService.getClass().getName());
		return "hello " + name;
	}
}
