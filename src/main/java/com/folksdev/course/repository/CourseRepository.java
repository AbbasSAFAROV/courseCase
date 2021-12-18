package com.folksdev.course.repository;

import com.folksdev.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// Create - Read -Update - Delete
public interface CourseRepository extends JpaRepository<Course, Long> {
}
