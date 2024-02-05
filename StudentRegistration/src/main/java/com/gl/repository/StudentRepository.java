package com.gl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
