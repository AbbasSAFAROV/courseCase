package com.folksdev.course.service;


import com.folksdev.course.entity.CourseBranch;
import com.folksdev.course.exception.CourseBranchNotFound;
import com.folksdev.course.model.dto.CourseBranchDto;
import com.folksdev.course.model.request.CourseBranchCreateRequest;
import com.folksdev.course.repository.CourseBranchRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseBranchService {

    private final CourseBranchRepository courseBranchRepository;
    private final ModelMapper modelMapper;

    public CourseBranchService(CourseBranchRepository courseBranchRepository, ModelMapper modelMapper) {
        this.courseBranchRepository = courseBranchRepository;
        this.modelMapper = modelMapper;
    }

    public List<CourseBranchDto> getAllCourseBranches(){
        return courseBranchRepository.findAll().stream().map(x->modelMapper.map(x,CourseBranchDto.class)).collect(Collectors.toList());
    }

    public CourseBranchDto getCourseBranchById(Long id){
        return modelMapper.map(findCourseById(id),CourseBranchDto.class);
    }

    public CourseBranchDto createCourseBranch(CourseBranchCreateRequest createRequest){
        return modelMapper.map(courseBranchRepository.save(modelMapper.map(createRequest,CourseBranch.class)),CourseBranchDto.class);
    }



    public CourseBranch findCourseById(Long id){
        return courseBranchRepository.findById(id).orElseThrow(()->new CourseBranchNotFound("Course branch not found with this id "+id));
    }

}
