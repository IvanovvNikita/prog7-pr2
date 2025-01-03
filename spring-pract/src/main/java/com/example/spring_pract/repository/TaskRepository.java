package com.example.spring_pract.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.spring_pract.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}