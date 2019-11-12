package com.wipro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.models.Cargo;
import com.wipro.models.CargoHistory;


@Repository
public interface CargoHistoryRepository extends JpaRepository<CargoHistory, Integer>{
	@Query("FROM CargoHistory")
    public List<CargoHistory> getAll();
}

