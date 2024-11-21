package com.buson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buson.entity.TesteEnvio;
@Repository
public interface TesteEnvioRepository extends JpaRepository<TesteEnvio, Long>{

}
