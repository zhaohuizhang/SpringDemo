package org.vip.napu.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Resource r = new FileSystemResource("helloMessage.xml");
		// BeanFactory f = new XmlBeanFactory(r);
		// Person p = (Person) f.getBean("person");
		// p.sayHello();
		BeanFactory f1 = new ClassPathXmlApplicationContext("helloMessage.xml");
		HelloWorld h = f1.getBean("newHelloWorld", HelloWorld.class);
		h.sayHello();
	}
}
