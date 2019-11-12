package com.wipro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.models.Cargo;
import com.wipro.models.Log;


@Repository
public interface LogRepository extends JpaRepository<Log, Integer>{
	@Query("FROM Log")
    public List<Log> getAll();
}

