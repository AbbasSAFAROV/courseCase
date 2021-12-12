package com.folksdev.course.model.request;

import com.folksdev.course.entity.Course;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCreateRequest {

    private String name;

    private String courseId;

}
