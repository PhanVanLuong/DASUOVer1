package com.dasuo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dasuo.entity.NgheNghiep;

@Repository
public interface NgheNghiepRepository extends JpaRepository<NgheNghiep, Integer>{

}
