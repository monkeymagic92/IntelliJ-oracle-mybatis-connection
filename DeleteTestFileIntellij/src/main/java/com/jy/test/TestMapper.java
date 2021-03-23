package com.jy.test;

import com.jy.test.model.TestVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

    List<TestVO> selBoard();

    int regBoard(TestVO vo);
}
