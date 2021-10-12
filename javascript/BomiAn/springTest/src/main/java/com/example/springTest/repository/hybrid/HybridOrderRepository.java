package com.example.springTest.repository.hybrid;


import com.example.springTest.entity.hybrid.HybridOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HybridOrderRepository extends JpaRepository<HybridOrder, Long> {
}