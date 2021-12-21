package com.folksdev.course.service;


import com.folksdev.course.configuration.Config;
import com.folksdev.course.entity.Course;
import com.folksdev.course.exception.CourseNotFoundException;
import com.folksdev.course.model.dto.CourseDto;
import com.folksdev.course.model.request.CourseCreateRequest;
import com.folksdev.course.repository.CourseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final Config config;
    private final ModelMapper modelMapper;

    public CourseService(CourseRepository courseRepository, Config config, ModelMapper modelMapper) {
        this.courseRepository = courseRepository;
        this.config = config;
        this.modelMapper = modelMapper;
    }

    public List<CourseDto> getAllCourses(){
        return courseRepository.findAll().stream().map(x->modelMapper.map(x,CourseDto.class)).collect(Collectors.toList());
    }

    public CourseDto getCourseById(Long id){
        return modelMapper.map(findCourseById(id),CourseDto.class);
    }

    public CourseDto createCourse(CourseCreateRequest courseCreateRequest){
        return modelMapper.map(courseRepository.save(modelMapper.map(courseCreateRequest, Course.class)),CourseDto.class);
    }

    public CourseDto updateCourse(CourseCreateRequest courseCreateRequest , Long id){

        Course course = findCourseById(id);
        course.setName(courseCreateRequest.getName());
        course.setCourseLimit(courseCreateRequest.getName());
        return modelMapper.map(course,CourseDto.class);

    }

    public void deleteUserById(Long id){
        Course course = findCourseById(id);
        courseRepository.delete(course);
    }

    public Course findCourseById(Long id){
        return courseRepository.findById(id).orElseThrow(()->new CourseNotFoundException("course not found with this id:"+id));
    }



}
