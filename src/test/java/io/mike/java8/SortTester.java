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
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

/**
 * 推荐使用
 * 原因：不用以匿名类方式实现原来的  Comparator 接口
 * @author zhaoming
 *
 * 2018年8月21日 上午9:27:25
 */
public class SortTester {
	
	@Test
	public void test_short_way() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		Collections.sort(list, (a, b) -> a - b);	//推荐使用	[params -> expression]
		System.out.println(list);
		Collections.sort(list, (a, b) -> b - a);
		System.out.println(list);
	}
	

	@Test
	@Deprecated
	public void test_old() {
		List<Integer> myList = new ArrayList<>();
		Collections.sort(myList, new Comparator<Integer>() {
			@Override
			public int compare (Integer n1, Integer n2) {
				return (n1 > n2 ? 1 : (n1 < n2 ? -1 : 0));
			}
		});
	}
	
	
}
