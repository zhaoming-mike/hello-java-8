/**
 * Copyright (c) 2018 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.java8;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2018年8月21日 上午11:26:40
 */
public class DateTester {

	static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	
	@Test
	public void test() {
		Instant instant = new Date().toInstant();
		System.out.println(instant);
		ZoneId systemDefault = ZoneId.systemDefault();
		System.out.println(systemDefault);
		String format = LocalDateTime.ofInstant(
				instant, 
				systemDefault
				).format(formatter);
		System.out.println(format);
	}
	
	
}
