package com.liang.mybatis.Mapper;

import com.liang.mybatis.Bean.Userinfo;
import com.liang.mybatis.Utils.mybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class userMapperTest {

	@Test
	public void user() {
		SqlSession session = mybatisUtil.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		List<Userinfo> userinfos =  userMapper.getUserInfoList();
		for (Userinfo userinfo : userinfos) {
			System.out.println(userinfo);
		}
		session.close();
	}

	@Test
	public void insert() {
		SqlSession session = mybatisUtil.getSqlSession();
		UserMapper userMapper = session.getMapper(UserMapper.class);
		int x = userMapper.insertUser(new Userinfo(1,"liang",24));
		if (x>0) {
			System.out.println("插入成功");
		}
		// 增删改需要提交事务
		session.commit();
		session.close();
	}

}
