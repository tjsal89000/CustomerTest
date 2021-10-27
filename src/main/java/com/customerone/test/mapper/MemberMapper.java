package com.customerone.test.mapper;


import com.customerone.test.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    void insert(MemberVO vo);
    MemberVO read(Long mno);

}
