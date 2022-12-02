package com.romadan.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romadan.models.entity.Pegawai;
import com.romadan.models.repo.PegawaiRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PegawaiService {

    @Autowired
    private PegawaiRepo pegawaiRepo;

    // FUNGSI CREATE DAN UPDATE SAMA AJA
    public Pegawai save(Pegawai pegawai) {
        return pegawaiRepo.save(pegawai);
    }

    // FUNGSI SEARCH BY ID DENGAN VALIDASI DATA SAAT ID TIDAK ADA
    public Pegawai findOne(Long id) {

        Optional<Pegawai> pegawai = pegawaiRepo.findById(id);

        if (!pegawai.isPresent()) {
            return null;
        } else {
            return pegawai.get();
        }

    }

    // FUNGSI SEARCH ALL
    public Iterable<Pegawai> findAll() {
        return pegawaiRepo.findAll();
    }

    // FUNGSI DELETE
    public void removeOne(Long id) {
        pegawaiRepo.deleteById(id);

    }
}
