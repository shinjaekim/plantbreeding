package com.example.Plantschedule.member;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    public Member createMember(Member member){

        return member;
    }

    public Member updateMember(Member member){

        return member;
    }

    public Member findMember(long memberId){

        return new Member();
    }

    public List<Member> findMembers(){

        return null;
    }

    public void deleteMember(long memberId){

    }
}
