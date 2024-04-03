package com.example.projectreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projectreview.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}
