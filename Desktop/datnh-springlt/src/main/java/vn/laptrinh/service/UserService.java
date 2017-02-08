// ----------------------------------------------------------------------------
// Copyright 2014, LAPTRINH.VN.
// All rights reserved
// ----------------------------------------------------------------------------
// Change History:
//  2014.08.17  datnh
//     - Initial release
// ----------------------------------------------------------------------------
package vn.laptrinh.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vn.laptrinh.dao.UserMapper;
import vn.laptrinh.domain.User;

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
public class UserService implements UserServiceLocal {

	public User getByUserId(long id) {
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		User user = mapper.selectByPrimaryKey(id);

		sqlSession.close();

		return user;
	}
	
	public List<User> getUserList() {
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		List<User> userList = mapper.getUserList();

		sqlSession.close();

		return userList;
	}

	public void insert(User user) {
		
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		mapper.insert(user);

		sqlSession.close();
	}

	public void updateByPrimaryKey(User user) {
		
		SqlSessionFactory sqlMapper = MyBatisService.getSessionFactory();
		SqlSession sqlSession = sqlMapper.openSession(true);

		UserMapper mapper = sqlSession.getMapper(UserMapper.class);

		mapper.updateByPrimaryKey(user);

		sqlSession.close();
	}

}
