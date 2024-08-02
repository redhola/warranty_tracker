package com.example.warranty_tracker.controller;

import com.example.warranty_tracker.model.Warranty;
import com.example.warranty_tracker.service.WarrantyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/warranties")
public class WarrantyController {

    @Autowired
    private WarrantyService warrantyService;

    @GetMapping("/{deviceId}")
    public ResponseEntity<Warranty> checkWarranty(@PathVariable Long deviceId) {
        Warranty warranty = warrantyService.checkWarranty(deviceId);
        return new ResponseEntity<>(warranty, HttpStatus.OK);
    }
}
