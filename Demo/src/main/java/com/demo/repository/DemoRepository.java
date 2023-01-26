package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Demo;

@Repository
public interface DemoRepository extends JpaRepository<Demo, String> {

}
