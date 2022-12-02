package com.romadan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romadan.models.entity.Pegawai;
import com.romadan.services.PegawaiService;

@RestController
@RequestMapping("/api/data-pegawai-romadan/v1")
public class HomeController {

    @Autowired
    private PegawaiService pegawaiService;

    // CREATE
    @PostMapping()
    public Pegawai create(@RequestBody Pegawai pegawai) {
        return pegawaiService.save(pegawai);
    }

    // UPDATE
    @PutMapping()
    public Pegawai update(@RequestBody Pegawai pegawai) {
        return pegawaiService.save(pegawai);
    }

    // FINDALL
    @GetMapping()
    public Iterable<Pegawai> findAll() {
        return pegawaiService.findAll();
    }

    // FIND BY ID
    @GetMapping("/{id}")
    public Pegawai findOne(@PathVariable("id") Long id) {
        return pegawaiService.findOne(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        pegawaiService.removeOne(id);
    }
}
