package com.customerone.test.service;


import com.customerone.test.domain.MemberVO;
import com.customerone.test.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public void insert(MemberVO vo) {
        memberMapper.insert(vo);
    }

    @Override
    public MemberVO read(Long mno) {
        return memberMapper.read(mno);
    }


}
