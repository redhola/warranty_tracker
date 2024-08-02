package com.example.warranty_tracker.repository;

import com.example.warranty_tracker.model.Warranty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WarrantyRepository extends JpaRepository<Warranty, Long> {
    Warranty findByDeviceId(Long deviceId);
}
