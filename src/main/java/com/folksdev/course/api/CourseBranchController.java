package com.folksdev.course.api;

import com.folksdev.course.model.dto.CourseBranchDto;
import com.folksdev.course.service.CourseBranchService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseBranchController {

    private final CourseBranchService service;
    private final ModelMapper modelMapper;

    public CourseBranchController(CourseBranchService service, ModelMapper modelMapper) {
        this.service = service;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<CourseBranchDto>> getAllCourseBranches(){
        return new ResponseEntity<>(service.getAllCourseBranches(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseBranchDto> getCourseBranchById(@PathVariable Long id){
        return new ResponseEntity<>(service.getCourseBranchById(id),HttpStatus.OK);
    }





}
