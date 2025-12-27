package com.examly.springapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Membership {
    @Id
    private int membershipId;
    private int memberId;
    private int typeId;
    public int getMembershipId() {
        return membershipId;
    }
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public int getTypeId() {
        return typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
