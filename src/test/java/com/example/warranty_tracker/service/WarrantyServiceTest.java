// package com.example.warranty_tracker.service;

// import com.example.warranty_tracker.model.Device;
// import com.example.warranty_tracker.model.Warranty;
// import com.example.warranty_tracker.repository.WarrantyRepository;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;

// import java.time.LocalDate;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.when;
// import static org.mockito.Mockito.any;

// @ExtendWith(MockitoExtension.class)
// public class WarrantyServiceTest {

//     @Mock
//     private WarrantyRepository warrantyRepository;

//     @InjectMocks
//     private WarrantyService warrantyService;

//     @Test
//     public void testCheckWarranty_Valid() {
//         Device device = new Device();
//         device.setId(1L);

//         Warranty warranty = new Warranty();
//         warranty.setDevice(device);
//         warranty.setPurchaseDate(LocalDate.now().minusYears(1));
//         warranty.setWarrantyStatus("Valid");

//         when(warrantyRepository.findByDeviceId(1L)).thenReturn(warranty);
//         when(warrantyRepository.save(any(Warranty.class))).thenReturn(warranty);  // Mock save method

//         Warranty result = warrantyService.checkWarranty(1L);

//         assertEquals("Valid", result.getWarrantyStatus());
//     }

//     @Test
//     public void testCheckWarranty_Expired() {
//         Device device = new Device();
//         device.setId(1L);

//         Warranty warranty = new Warranty();
//         warranty.setDevice(device);
//         warranty.setPurchaseDate(LocalDate.now().minusYears(3));
//         warranty.setWarrantyStatus("Expired");

//         when(warrantyRepository.findByDeviceId(1L)).thenReturn(warranty);
//         when(warrantyRepository.save(any(Warranty.class))).thenReturn(warranty);  // Mock save method

//         Warranty result = warrantyService.checkWarranty(1L);

//         assertEquals("Expired", result.getWarrantyStatus());
//     }
// }
