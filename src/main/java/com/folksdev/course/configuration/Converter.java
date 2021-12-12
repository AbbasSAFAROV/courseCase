package com.folksdev.course.configuration;

import com.folksdev.course.entity.Student;
import com.folksdev.course.model.dto.CourseDto;
import com.folksdev.course.model.dto.StudentDto;
import org.springframework.stereotype.Component;

@Component
public class Converter {

    public StudentDto convertToDto(Student student){
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setCourse(student.getCourse());
        return studentDto;
    }

}
