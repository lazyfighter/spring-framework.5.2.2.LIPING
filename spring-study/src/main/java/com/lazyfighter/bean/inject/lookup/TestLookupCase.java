package com.lazyfighter.bean.inject.lookup;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLookupCase {


	@Test
	public void testLookup() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(new String[]{"com.lazyfighter.bean.inject.lookup"});
		LookUpService bean = applicationContext.getBean(LookUpImpl1.class);
		bean.sayHi();
	}

}
