package com.example.warranty_tracker.model;

import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String serialNumber;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;
}
