package org.vip.napu.spring.demo;

public class Person {
	private IHelloMessage ihelloMessage;

	public IHelloMessage getIhelloMessage() {
		return ihelloMessage;
	}

	public void setIhelloMessage(IHelloMessage ihelloMessage) {
		this.ihelloMessage = ihelloMessage;
	}

	public void sayHello() {
		System.out.println(ihelloMessage.sayHello());
	}
}
