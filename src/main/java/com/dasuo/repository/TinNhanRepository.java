package com.dasuo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dasuo.entity.TinNhan;

@Repository
public interface TinNhanRepository extends JpaRepository<TinNhan, Integer>{

}
