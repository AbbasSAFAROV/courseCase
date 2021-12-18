package com.folksdev.course.api;


import com.folksdev.course.entity.Student;
import com.folksdev.course.model.dto.StudentDto;
import com.folksdev.course.model.request.StudentCreateRequest;
import com.folksdev.course.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentCreateRequest createRequest){
        return new ResponseEntity<>(studentService.createStudent(createRequest),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@RequestBody StudentCreateRequest createRequest,@PathVariable String id){
        return new ResponseEntity<>(studentService.updateStudent(createRequest,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable String id){
        return "null";
    }


}
