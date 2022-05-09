package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alian;

@Repository
public interface AlianRepo extends  JpaRepository<Alian, Integer>  //t-entity class name
{                                                         //id-data type of primary key

}
