package com.jy.test;

import com.jy.test.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestMapper mapper;


    public List<TestVO> selBoard() {

        return mapper.selBoard();
    }

    public int regBoard(TestVO vo) {
        return mapper.regBoard(vo);
    }
}
