package com.examly.springapp.service;

import com.examly.springapp.model.Member;
import com.examly.springapp.repository.MemberRepository;
import com.examly.springapp.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository repo;

    @Override
    public Member createMember(Member member) {
        return repo.save(member);
    }

    @Override
    public Member getMember(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found with id: " + id));
    }

    @Override
    public Member updateMember(Long id, Member member) {
        Member existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Member not found with id: " + id));
        existing.setName(member.getName());
        existing.setEmail(member.getEmail());
        return repo.save(existing);
    }

    @Override
    public List<Member> getPaginatedMembers(int page, int size) {
        return repo.findAll(PageRequest.of(page, size)).getContent();
    }
}
