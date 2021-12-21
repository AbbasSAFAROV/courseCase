package com.folksdev.course.api;


import com.folksdev.course.entity.Course;
import com.folksdev.course.model.dto.CourseDto;
import com.folksdev.course.model.request.CourseCreateRequest;
import com.folksdev.course.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        return new ResponseEntity<>(courseService.getAllCourses(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable Long id){
        return new ResponseEntity<>(courseService.getCourseById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseCreateRequest createRequest){
        return new ResponseEntity<>(courseService.createCourse(createRequest),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseDto> updateCourseById(@RequestBody CourseCreateRequest createRequest , @PathVariable Long id){
        return new ResponseEntity<>(courseService.updateCourse(createRequest,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseById(@PathVariable Long id){
        return ResponseEntity.ok().body("course deleted with this id "+id);
    }



}
