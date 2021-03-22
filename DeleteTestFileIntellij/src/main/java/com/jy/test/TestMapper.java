package com.jy.test;

import com.jy.test.model.TestVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    TestVO selBoard();
}
