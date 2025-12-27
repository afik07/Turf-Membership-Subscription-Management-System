package com.examly.springapp.service;

import com.examly.springapp.exception.ResourceNotFoundException;
import com.examly.springapp.model.MembershipType;
import com.examly.springapp.repository.MembershipTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipTypeServiceImpl implements MembershipTypeService {

    @Autowired
    private MembershipTypeRepository repo;

    @Override
    public MembershipType create(MembershipType mtype) {
        return repo.save(mtype);
    }

    @Override
    public MembershipType update(Long id, MembershipType mtype) {
        MembershipType existing = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MembershipType not found"));
        existing.setTypeName(mtype.getTypeName());
        existing.setPrice(mtype.getPrice());
        existing.setDurationInMonths(mtype.getDurationInMonths());
        return repo.save(existing);
    }

    @Override
    public List<MembershipType> getAll() {
        return repo.findAll();
    }

    @Override
    public MembershipType getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MembershipType not found"));
    }

    @Override
    public List<MembershipType> getByName(String name) {
        List<MembershipType> list = repo.findByTypeName(name);
        if(list.isEmpty()) throw new ResourceNotFoundException("No membership types found");
        return list;
    }

    @Override
    public List<MembershipType> getByPriceRange(double min, double max) {
        return repo.findByPriceBetween(min, max);
    }

    @Override
    public List<MembershipType> getByDurationGreaterThan(int duration) {
        List<MembershipType> list = repo.findByDurationInMonthsGreaterThan(duration);
        if(list.isEmpty()) throw new ResourceNotFoundException("No membership types found with duration greater than "+duration);
        return list;
    }

    @Override
    public List<MembershipType> getByPriceLessThan(double price) {
        List<MembershipType> list = repo.findByPriceLessThan(price);
        if(list.isEmpty()) throw new ResourceNotFoundException("No membership types found");
        return list;
    }
}
