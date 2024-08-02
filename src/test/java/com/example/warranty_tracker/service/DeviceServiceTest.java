// package com.example.warranty_tracker.service;

// import com.example.warranty_tracker.model.Device;
// import com.example.warranty_tracker.repository.DeviceRepository;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;

// import java.util.Optional;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.Mockito.*;

// @ExtendWith(MockitoExtension.class)
// public class DeviceServiceTest {

//     @Mock
//     private DeviceRepository deviceRepository;

//     @InjectMocks
//     private DeviceService deviceService;

//     @Test
//     public void testSaveDevice() {
//         Device device = new Device();
//         device.setSerialNumber("123456");
//         device.setBrand("BrandA");
//         device.setModel("ModelX");

//         when(deviceRepository.save(any(Device.class))).thenReturn(device);

//         Device savedDevice = deviceService.saveDevice(device);

//         assertEquals("123456", savedDevice.getSerialNumber());
//         assertEquals("BrandA", savedDevice.getBrand());
//         assertEquals("ModelX", savedDevice.getModel());
//     }

//     @Test
//     public void testUpdateDevice() {
//         Device existingDevice = new Device();
//         existingDevice.setId(1L);
//         existingDevice.setSerialNumber("123456");
//         existingDevice.setBrand("BrandA");
//         existingDevice.setModel("ModelX");

//         Device updatedDevice = new Device();
//         updatedDevice.setSerialNumber("654321");
//         updatedDevice.setBrand("BrandB");
//         updatedDevice.setModel("ModelY");

//         when(deviceRepository.findById(1L)).thenReturn(Optional.of(existingDevice));
//         when(deviceRepository.save(any(Device.class))).thenReturn(updatedDevice);

//         Device result = deviceService.updateDevice(1L, updatedDevice);

//         assertEquals("654321", result.getSerialNumber());
//         assertEquals("BrandB", result.getBrand());
//         assertEquals("ModelY", result.getModel());
//     }

//     @Test
//     public void testDeleteDevice() {
//         Device device = new Device();
//         device.setId(1L);

//         doNothing().when(deviceRepository).deleteById(1L);

//         deviceService.deleteDevice(1L);

//         verify(deviceRepository, times(1)).deleteById(1L);
//     }
// }
