package com.example.warranty_tracker.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Warranty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private Device device;

    @NotNull
    private LocalDate purchaseDate;

    private String warrantyStatus;
}
