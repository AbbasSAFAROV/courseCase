package com.folksdev.course.service;


import com.folksdev.course.configuration.Config;
import com.folksdev.course.configuration.Converter;
import com.folksdev.course.entity.Student;
import com.folksdev.course.model.dto.StudentDto;
import com.folksdev.course.model.request.StudentCreateRequest;
import com.folksdev.course.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {

    // DI -> Dependency Injection
    private final StudentRepository studentRepository;
    private final Converter converter;
    private final Config config;

    public StudentService(StudentRepository studentRepository, Converter converter, Config config) {
        this.studentRepository = studentRepository;
        this.converter = converter;
        this.config = config;
    }

    public List<StudentDto> getAllStudents(){

        List<Student> studentDtos = studentRepository.findAll();
        return studentDtos.stream().map(x->config.modelMapper().map(x,StudentDto.class)).collect(Collectors.toList());

    }

    public StudentDto createStudent(StudentCreateRequest createRequest){
        Student student = config.modelMapper().map(createRequest,Student.class);
        return config.modelMapper().map(studentRepository.save(student),StudentDto.class);
    }

    public StudentDto updateStudent(StudentCreateRequest createRequest, String id){
        return null;
    }


}
