package com.customerone.test.service;

import com.customerone.test.domain.MemberVO;


public interface MemberService {

    void insert(MemberVO vo);
    MemberVO read(Long mno);

}
