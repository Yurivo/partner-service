package com.example.partner_service.repository;

import com.example.partner_service.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, Long> {
    List<Partner> findByNameContainingIgnoreCase(String name);

    List<Partner> findByDirectorContainingIgnoreCase(String director);
}