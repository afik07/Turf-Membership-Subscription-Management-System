package com.examly.springapp.service;

import com.examly.springapp.model.MembershipType;
import java.util.List;

public interface MembershipTypeService {
    MembershipType create(MembershipType mtype);
    MembershipType update(Long id, MembershipType mtype);
    List<MembershipType> getAll();
    MembershipType getById(Long id);
    List<MembershipType> getByName(String name);
    List<MembershipType> getByPriceRange(double min, double max);
    List<MembershipType> getByDurationGreaterThan(int duration);
    List<MembershipType> getByPriceLessThan(double price);
}
