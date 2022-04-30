package com.cakesandbakes.major.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakesandbakes.major.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
