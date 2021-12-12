package com.folksdev.course.repository;

import com.folksdev.course.entity.CourseBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseBranchRepository extends JpaRepository<CourseBranch, Long> {
}
