package com.study.mybatistudy.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.mybatistudy.vo.MemberVo;

@Mapper
public interface MemberRepository {
    
        List<MemberVo> getAllMember();

}
