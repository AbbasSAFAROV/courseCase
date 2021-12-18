package com.folksdev.course.repository;

import com.folksdev.course.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // IOC Container -> List<Object> objects = new ArrayList<>();
    // StudentRepository studentRepository = new StudentRepository();
}
