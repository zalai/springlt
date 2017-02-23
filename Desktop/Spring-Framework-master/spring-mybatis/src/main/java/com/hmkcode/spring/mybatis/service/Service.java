package com.hmkcode.spring.mybatis.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.hmkcode.spring.mybatis.mapper.Mapper;
import com.hmkcode.spring.mybatis.vo.Person;

public class Service {

	@Autowired
	private Mapper mapper;

	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	public List<Person> selectAllPerson() {
		return mapper.selectAllPerson();
	}

	public Person selectPerson(int id) {
		return mapper.selectPerson(id);
	}

	public int insertPerson(Person person) throws SQLException {

		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = txManager.getTransaction(def);
		try {
		  userMapper.insertUser(user);
		}
		catch (MyException ex) {
		  txManager.rollback(status);
		  throw ex;
		}
		txManager.commit(status);

		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.getConnection().setAutoCommit(false);
		sqlSession.getConnection().getAutoCommit();
		try {
			result = mapper.insertPerson(person);
			int a = 1/0;
			sqlSession.commit();
		} catch (Exception e) {
			sqlSession.rollback();
		} finally {
			sqlSession.close();
		}

		return result;
	}
}
