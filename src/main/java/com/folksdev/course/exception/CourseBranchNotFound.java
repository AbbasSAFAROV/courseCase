package com.folksdev.course.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CourseBranchNotFound extends  RuntimeException{

    public CourseBranchNotFound(String message) {
        super(message);
    }
}
