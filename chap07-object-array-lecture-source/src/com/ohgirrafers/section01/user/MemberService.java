package com.ohgirrafers.section01.user;

public class MemberService {

    public void signUpMember(){
        Member[] members = new Member[5];
        members[0] = new Member(1, "user01", "pass01", "홍홍", 20, '남');
        members[1] = new Member(2, "user02", "pass02", "김김", 22, '여');
        members[2] = new Member(3, "user03", "pass03", "이이", 21, '여');
        members[3] = new Member(4, "user04", "pass04", "박박", 23, '남');
        members[4] = new Member(5, "user05", "pass05", "서동훈", 24, '남');

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.regist(members);
    }

    public void showAllMembers(){
        MemberFinder finder = new MemberFinder();
        for (Member member : finder.findAllMembers()){
            if (member!=null){
                System.out.println(member.getInformation());
            }
        }

    }
}
