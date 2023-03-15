package com.amrit.studentmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amrit.studentmanagement.Domain.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
} 