package com.example.partner_service.controller;

import com.example.partner_service.model.Partner;
import com.example.partner_service.repository.PartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnerController {

    private final PartnerRepository repository;

    public PartnerController(PartnerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Partner> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Partner add(@RequestBody Partner partner) {
        return repository.save(partner);
    }

    @PutMapping("/{id}")
    public Partner update(@PathVariable Long id, @RequestBody Partner partner) {
        partner.setId(id);
        return repository.save(partner);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
