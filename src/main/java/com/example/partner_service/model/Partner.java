package com.example.partner_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "partners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Partner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Наименование")
    private String name;

    @Column(name = "Руководители")
    private String director;

    @Column(name = "ЮридическийАдрес")
    private String address;

    @Column(name = "Телефон")
    private String phone; // Используем String для поддержки любых форматов телефонов

    @Column(name = "Факс")
    private String fax;   // Также String для факса
}
