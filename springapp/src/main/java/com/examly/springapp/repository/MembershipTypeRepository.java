package com.examly.springapp.repository;

import com.examly.springapp.model.MembershipType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MembershipTypeRepository extends JpaRepository<MembershipType, Long> {

    // Derived query for finding by name (Spring generates this automatically)
    List<MembershipType> findByTypeName(String typeName);

    // JPQL query for price range
    @Query("SELECT m FROM MembershipType m WHERE m.price BETWEEN ?1 AND ?2")
    List<MembershipType> findByPriceBetween(double min, double max);

    // Derived query for duration greater than
    List<MembershipType> findByDurationInMonthsGreaterThan(int duration);

    // Derived query for price less than
    List<MembershipType> findByPriceLessThan(double price);
}