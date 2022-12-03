/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.marisaenjel.karyawanservice.Repository;

import com.marisaenjel.karyawanservice.Entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long>{

    public Karyawan findByKaryawanId(Long karyawanId);
    
}
