/**
 * Copyright (c) 2018 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike.java8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.junit.Test;

/**
 * @author zhaoming
 *
 * 2018年8月22日 下午3:53:52
 */
public class Base64Tester {

	@Test
	public void test() throws UnsupportedEncodingException {
		// 编码
		String asB64 = Base64.getEncoder().encodeToString("some string".getBytes("utf-8"));
		System.out.println(asB64); // 输出为: c29tZSBzdHJpbmc=
		// 解码
		byte[] asBytes = Base64.getDecoder().decode("c29tZSBzdHJpbmc=");
		System.out.println(new String(asBytes, "utf-8")); // 输出为: some string
	}
	
	
}
