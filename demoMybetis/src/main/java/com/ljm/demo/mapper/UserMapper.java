package com.ljm.demo.mapper;


import com.ljm.demo.bean.UmsMember;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
@Component
public interface UserMapper extends Mapper<UmsMember> {

    //扩展自身的查询方法
    List<UmsMember> selectAllUser();
}
