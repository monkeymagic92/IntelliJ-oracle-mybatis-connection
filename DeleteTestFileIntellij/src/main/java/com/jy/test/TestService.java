package com.jy.test;

import com.jy.test.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestMapper mapper;

    public TestVO selBoard() {
        return mapper.selBoard();
    }
}
