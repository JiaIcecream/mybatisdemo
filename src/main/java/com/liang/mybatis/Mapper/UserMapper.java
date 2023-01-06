package com.liang.mybatis.Mapper;

import com.liang.mybatis.Bean.Teacher;
import com.liang.mybatis.Bean.Userinfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

public interface UserMapper {
	List<Userinfo> getUserInfoList();

	int insertUser(Userinfo userinfo);


	// 需要传入多个参数时使用  @Param("id") sql语句中的取值是按照@Param中的值来取的
	@Select("select * from userinfo where id = #{id} and name = #{name}")
	Userinfo getUserinfoById(@Param("id") int id,@Param("name") String name);

	Teacher getTeacherById(@Param("id") int id);
}
