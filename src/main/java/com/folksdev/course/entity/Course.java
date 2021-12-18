package com.folksdev.course.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Course {

    //Code first

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String courseLimit;

    @ManyToOne
    private CourseBranch courseBranch;

    @OneToMany
    private List<Student> students;





}
