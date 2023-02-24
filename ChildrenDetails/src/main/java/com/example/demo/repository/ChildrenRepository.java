package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Children;

public interface ChildrenRepository extends JpaRepository<Children, Integer> {

}
