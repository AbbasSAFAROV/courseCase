package com.folksdev.course.api;

import com.folksdev.course.model.dto.CourseBranchDto;
import com.folksdev.course.model.request.CourseBranchCreateRequest;
import com.folksdev.course.service.CourseBranchService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coursebranches")
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

    @PostMapping
    public ResponseEntity<CourseBranchDto> createCourseBranch(@RequestBody CourseBranchCreateRequest createRequest){
        return new ResponseEntity<>(service.createCourseBranch(createRequest),HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CourseBranchDto> updateCourseBranch(@RequestBody CourseBranchCreateRequest createRequest, @PathVariable Long id){
        return new ResponseEntity<>(service.updateCourseBranch(createRequest,id),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCourseBranch(@PathVariable Long id){
        return new ResponseEntity<>(service.deleteCourseBranch(id),HttpStatus.NO_CONTENT);
    }


}
