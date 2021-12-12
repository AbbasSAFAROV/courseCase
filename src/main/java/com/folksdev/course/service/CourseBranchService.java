package com.folksdev.course.service;


import com.folksdev.course.entity.CourseBranch;
import com.folksdev.course.model.dto.CourseBranchDto;
import com.folksdev.course.repository.CourseBranchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseBranchService {

    private final CourseBranchRepository courseBranchRepository;

    public CourseBranchService(CourseBranchRepository courseBranchRepository) {
        this.courseBranchRepository = courseBranchRepository;
    }

    public List<CourseBranchDto> getAllCourseBranches(){
        return null;
    }

}
