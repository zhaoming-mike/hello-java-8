/**
 * Copyright (c) 2018 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.java8;

import java.util.function.Function;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2018年8月21日 上午9:40:03
 */
public class FunctionExpressionTester {

	@Test
	public void test_class_pow() {
		PowerFunction<Double, Double, Double> fn = Math::pow;
		Double apply = fn.apply(-2.0, 2.0);
		System.out.println(apply);
	}
	
	@Test
	public void test_class_abs() {
		Function<Double, Double> fn = Math::abs;
		Double apply = fn.apply(-1.1);
		System.out.println(apply);
	}
	
	
}
