package com.wipro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.models.Cargo;


@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer>{
	@Query("FROM Cargo")
    public List<Cargo> getAll();
}

