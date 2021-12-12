package com.folksdev.course.model.request;

import com.folksdev.course.entity.CourseBranch;
import com.folksdev.course.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseCreateRequest {

    private String name;

    private Integer limit;

    private String courseBranchId;

}
