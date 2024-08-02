package com.example.warranty_tracker.service;

import com.example.warranty_tracker.model.Warranty;
import com.example.warranty_tracker.repository.WarrantyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class WarrantyService {

    @Autowired
    private WarrantyRepository warrantyRepository;

    public Warranty checkWarranty(Long deviceId) {
        Warranty warranty = warrantyRepository.findByDeviceId(deviceId);
        if (warranty == null) {
            throw new RuntimeException("Warranty not found for device id: " + deviceId);
        }
        if (warranty.getPurchaseDate().plusYears(2).isBefore(LocalDate.now())) {
            warranty.setWarrantyStatus("Expired");
        } else {
            warranty.setWarrantyStatus("Valid");
        }
        return warrantyRepository.save(warranty);
    }
}
