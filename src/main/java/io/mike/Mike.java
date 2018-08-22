/**
 * Copyright (c) 2018 YY Inc.
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * YY Inc. ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with YY Inc.
 */
package io.mike;

import static org.apache.commons.lang3.StringUtils.*;

/**
 * @author zhaoming
 *
 * 2018年8月22日 下午3:21:32
 */
public class Mike {

	public static final Mike DEFAULT_MIKE = new Mike(null);
	
	public static final String DEFAULT_NAME = "default_mike";
	
	private String name = DEFAULT_NAME;
	
	private Mike mike;
	
	public Mike(String name) {
		if(isNotEmpty(name))
			this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mike getMike() {
		return mike;
	}

	public void setMike(Mike mike) {
		this.mike = mike;
	}
	
}
