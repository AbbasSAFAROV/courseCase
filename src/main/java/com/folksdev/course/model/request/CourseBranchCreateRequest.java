package com.folksdev.course.model.request;

import com.folksdev.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseBranchCreateRequest {


    private String name;

    private List<Course> course;

}
