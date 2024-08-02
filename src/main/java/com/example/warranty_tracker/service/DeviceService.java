package com.example.warranty_tracker.service;

import com.example.warranty_tracker.model.Device;
import com.example.warranty_tracker.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    public Device saveDevice(Device device) {
        return deviceRepository.save(device);
    }

    public Device updateDevice(Long id, Device device) {
        Device existingDevice = deviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Device not found"));
        existingDevice.setBrand(device.getBrand());
        existingDevice.setModel(device.getModel());
        existingDevice.setSerialNumber(device.getSerialNumber());
        return deviceRepository.save(existingDevice);
    }

    public void deleteDevice(Long id) {
        deviceRepository.deleteById(id);
    }

    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    public Device getDeviceById(Long id) {
        return deviceRepository.findById(id).orElseThrow(() -> new RuntimeException("Device not found"));
    }
}
