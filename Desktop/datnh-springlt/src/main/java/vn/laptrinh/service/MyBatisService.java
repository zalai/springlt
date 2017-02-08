// ----------------------------------------------------------------------------
// Copyright 2014, LAPTRINH.VN.
// All rights reserved
// ----------------------------------------------------------------------------
// Change History:
//  2014.08.17  datnh
//     - Initial release
// ----------------------------------------------------------------------------
package vn.laptrinh.service;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * <p>
 * Title: SpringLT
 * </p>
 * <p>
 * Copyright: Copyright (c) by laptrinh.vn 2014
 * </p>
 * 
 * @author laptrinh.vn
 * @version 0.1
 */
public class MyBatisService {

	private static String resource = "vn/laptrinh/dao/xml/mybatisConfig.xml";
	private static Reader reader = null;
	private static SqlSessionFactory sqlMapper = null;

	public static synchronized SqlSessionFactory getSessionFactory() {
		if (sqlMapper == null) {
			try {
				reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			} catch (IOException e) {
				System.err.println("Error SQL Session: " + e.toString());
			}
		}

		return sqlMapper;
	}
}
