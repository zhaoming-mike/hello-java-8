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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2018年8月21日 上午9:54:45
 */
public class StreamTester {

	@Test
	public void test_one() {
		List<Map<String, String>> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Map<String, String> user = new HashMap<>();
			user.put("uid", String.valueOf(i));
			user.put("sex", String.valueOf(new Random().nextInt(2)));
			list.add(user);
		}
		
		list.stream().filter(e -> "1".equals(e.get("sex"))).forEach(e -> { System.out.println(e); });
		list.stream().filter(e -> "1".equals(e.get("sex"))).map(e -> e.get("uid")).forEach(e -> { System.out.println(e); });
	}
	
	
}
