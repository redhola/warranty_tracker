package com.example.warranty_tracker.repository;

import com.example.warranty_tracker.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
