package com.study.mybatistudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.mybatistudy.service.MemberService;
import com.study.mybatistudy.vo.MemberVo;

@Controller
@RequestMapping("/")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/home")
    public String index(Model model) {

        List<MemberVo> memberList = memberService.getAllMember();
        System.out.println("size: " + memberList.size());

        model.addAttribute("memberList", memberList);
        return "home";
    }

}