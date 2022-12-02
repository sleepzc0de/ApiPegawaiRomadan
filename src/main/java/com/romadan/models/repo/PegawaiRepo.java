package com.romadan.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.romadan.models.entity.Pegawai;

public interface PegawaiRepo extends CrudRepository<Pegawai, Long> {

}
