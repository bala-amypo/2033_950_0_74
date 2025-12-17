package com.example.demo.repository;
import org.springframework.wweb.bind.annotation.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.repository;
@repository
public interface studentrepository extends JpaRepository<studententity,Integer>{

}