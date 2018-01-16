package com.capsella.vineguards.db.dao;


import com.capsella.vineguards.db.entities.Producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducerRepository extends JpaRepository<Producer,Long>{
    Producer findProducerByUsername(String username);
}