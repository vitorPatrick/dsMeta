package com.devSuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {
	
}
