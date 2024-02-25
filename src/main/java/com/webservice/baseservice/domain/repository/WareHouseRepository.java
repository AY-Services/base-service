package com.webservice.baseservice.domain.repository;

import com.webservice.baseservice.domain.entities.WareHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WareHouseRepository extends JpaRepository<WareHouse, String> {
}
