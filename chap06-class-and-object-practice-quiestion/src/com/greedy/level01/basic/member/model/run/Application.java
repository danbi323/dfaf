package com.greedy.level01.basic.member.model.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {

    public static void main(String[] args) {
        MemberVO memberVO = new MemberVO();

        System.out.println(memberVO.getInformation());
        memberVO.setAge(24);
        memberVO.setEmail("dan123@greedy.com");
        memberVO.setGender('M');
        memberVO.setId("danbi");
        memberVO.setPhone("010-7107-6787");
        memberVO.setPwd("db2323");

        System.out.println(memberVO.getInformation());




    }
}
