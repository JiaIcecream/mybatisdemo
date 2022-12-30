package com.liang.mybatis.Bean;

import java.util.Date;
import lombok.Data;
@Data
public class Userinfo {

  private Integer id;
  private String name;
  private Integer age;

  public Userinfo(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }
}
