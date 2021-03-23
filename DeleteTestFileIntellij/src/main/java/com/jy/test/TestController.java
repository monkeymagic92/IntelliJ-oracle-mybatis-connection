package com.jy.test;


import com.jy.test.model.TestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
// config.properties 파일안에 프로퍼티 값을 가져오기 위한 매핑 주소
@PropertySource("classpath:/config/config.properties")
@RequestMapping("/board")
public class TestController {

    // Autowired를 사용안하고 생성자 주입을 통해 service객체에 접근
    private TestService service;

    public TestController(TestService service) {
        this.service = service;
    }

    @Value("${db.username}")    // PropertySouce 어노테이션으로 config/config.pro.. 에 값을 받아옴
    private String username;

    @Value("${db.password}")
    private String password;

    public static int num = 5;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String test(Model model) {

        List<TestVO> list = service.selBoard();
        for(int i=0; i<list.size(); i++) {
            System.out.println("list size : " + list.size());
        }

        model.addAttribute("username", username);
        model.addAttribute("password", password);

        model.addAttribute("name", "이재용");
        model.addAttribute("list", service.selBoard());
        return "board/list";
    }

    @RequestMapping(value="/reg", method = RequestMethod.GET)
    public String reg(Model model, TestVO vo) {
        num++;
        model.addAttribute("num", num);
        return "board/reg";

    }

    @RequestMapping(value="/regPost", method = RequestMethod.POST)
    public String regPost(Model model, TestVO vo) {
        System.out.println("i_board ; " + vo.getI_board());
        System.out.println("i_user : " + vo.getI_user() );
        System.out.println("title : " + vo.getTitle());
        System.out.println("ctnt : " + vo.getCtnt());
        int result = service.regBoard(vo);
        System.out.println("result : " + result);

        return "redirect:/board/list";
    }
}
