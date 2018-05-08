package com.github.vindell.javassist.proxy;

import java.lang.reflect.Method;

import org.junit.Test;

import com.github.vindell.javassist.JavassistWebserviceGenerator;

/**
 * https://www.cnblogs.com/coshaho/p/5105545.html
 */
public class JavassistProxyExample4 {

	@Test
	public void testDynamicInterface() throws Exception {

		JavassistWebserviceGenerator javassistLearn = new JavassistWebserviceGenerator();

		Class<?> webservice = javassistLearn.createDynamicInterface();

		Object obj = JavassistProxy.getProxy(webservice);

		
		Method mt =  obj.getClass().getDeclaredMethod("sayHello", String.class);
		mt.invoke(obj, "xxx");
		
		obj.toString();

	}

}