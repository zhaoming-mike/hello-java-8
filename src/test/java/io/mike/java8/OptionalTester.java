/**
 * Copyright (c) 2018 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.java8;

import java.util.ArrayList;
import java.util.List;
import static java.util.Optional.*;
import java.util.Optional;

import static org.apache.commons.lang3.builder.ToStringBuilder.*;
import org.junit.Test;

import static io.mike.Mike.*;
import io.mike.Mike;

/**
 * @author zhaoming
 *
 * 2018年8月21日 上午9:54:45
 */
public class OptionalTester {

	@Test
	public void test_mike() {
		Mike mike = null;
		Mike a = new Mike("A");
		Mike b = new Mike("B");
		Mike c = new Mike("C");
//		c = null;
		b.setMike(c);
//		b = null;
		a.setMike(b);
		mike = a;
		//可以方便的使用 Optional chaining 进行链式调用
		System.out.println(reflectionToString(
				ofNullable(mike)
				.map(e -> e.getMike())	//b
				.map(e -> e.getMike())	//c
				.orElse(DEFAULT_MIKE)));
	}
	
	@Test
	public void test() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 30000; i++) {
			list.add(i);
		}
		Optional<Integer> findFirst = list.stream().parallel()
				.map(e -> e * 100)
				.filter(e -> e > 2000000)
				.findFirst();
		System.out.println(findFirst.orElse(0));
		//list.forEach(item -> { System.out.println(item); });
	}
	
	
}
