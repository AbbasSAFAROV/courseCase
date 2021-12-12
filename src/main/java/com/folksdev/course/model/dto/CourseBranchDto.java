package com.folksdev.course.model.dto;

import com.folksdev.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseBranchDto {

    private String name;

    private List<Course> course;

}
