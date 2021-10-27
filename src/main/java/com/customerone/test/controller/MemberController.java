package com.customerone.test.controller;

import com.customerone.test.domain.MemberVO;
import com.customerone.test.service.MemberService;
;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public String MemberInsert(@RequestBody MemberVO vo) {
        memberService.insert(vo);
        return "Create 완료";
    }

    @GetMapping("/{mno}")
    public MemberVO read(@PathVariable Long mno) {
        return memberService.read(mno);
    }




}
