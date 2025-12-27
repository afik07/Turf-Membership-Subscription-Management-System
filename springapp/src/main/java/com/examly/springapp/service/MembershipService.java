package com.examly.springapp.service;
import com.examly.springapp.model.Membership;
import java.util.List;
public interface MembershipService {
    Membership saveMembership(Membership membership);
    Membership getMembershipById(Long id);
    List<Membership> getAllMemberships();
    Membership updateMembership(Long id, Membership membership);
    void deleteMembership(Long id);
}