package com.liang.mybatis.Mapper;

import com.liang.mybatis.Bean.Userinfo;

import java.util.List;

public interface UserMapper {
	List<Userinfo> getUserInfoList();

	int insertUser(Userinfo userinfo);
}
