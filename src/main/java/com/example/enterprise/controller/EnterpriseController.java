package com.example.enterprise.controller;

import com.example.enterprise.service.SequenceGeneratorService;
import com.example.enterprise.entity.Enterprise;
import com.example.enterprise.repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enterprises")
public class EnterpriseController {

    @Autowired
    private EnterpriseRepository enterpriseRepository;

    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;

    @PostMapping
    public Enterprise save(@RequestBody Enterprise enterprise) {
        enterprise.setId(sequenceGeneratorService.generateSequence(Enterprise.SEQUENCE_NAME));
        return enterpriseRepository.save(enterprise);
    }

    @GetMapping("/{dni}")
    public Enterprise find(@PathVariable String dni) {
        return enterpriseRepository.findByDni(dni);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        enterpriseRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Enterprise update(@PathVariable long id, @RequestBody Enterprise enterprise) {
        return enterpriseRepository.save(enterprise);
    }

}
