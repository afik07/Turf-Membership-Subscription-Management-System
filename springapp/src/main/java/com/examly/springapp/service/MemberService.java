package com.examly.springapp.service;

import com.examly.springapp.model.Member;
import java.util.List;

public interface MemberService {
    Member createMember(Member member);
    Member getMember(Long id);
    Member updateMember(Long id, Member member);
    List<Member> getPaginatedMembers(int page, int size);
}
