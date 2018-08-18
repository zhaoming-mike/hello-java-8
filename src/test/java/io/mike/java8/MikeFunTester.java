
package io.mike.java8;

import org.junit.Test;

public class MikeFunTester {

	@Test
	public void test() {
		MikeFun mikeFun = () -> {
			System.out.println("Hello, FunctionalInterface !");
			System.out.println("How are you ?");
		};
		mikeFun.onlyOne();
		//什么是函数式编程？简单理解就是把一个函数当成参数传递。
	}
	
	
}
