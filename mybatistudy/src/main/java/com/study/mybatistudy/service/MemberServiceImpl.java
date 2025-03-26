package com.study.mybatistudy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.mybatistudy.repository.MemberRepository;
import com.study.mybatistudy.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<MemberVo> getAllMember(){
        return memberRepository.getAllMember();
    }
}
