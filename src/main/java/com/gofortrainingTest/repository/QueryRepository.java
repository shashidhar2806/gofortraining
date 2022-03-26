package com.gofortrainingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gofortrainingTest.model.Query;


@Repository
public interface QueryRepository extends JpaRepository<Query, Integer> {

}
