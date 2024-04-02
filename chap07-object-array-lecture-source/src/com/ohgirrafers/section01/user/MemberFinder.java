package com.ohgirrafers.section01.user;

public class MemberFinder {

    public Member[] findAllMembers(){

        return MemberRepository.findAllMembers();
    }
}
