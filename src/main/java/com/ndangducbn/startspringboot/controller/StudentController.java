package com.ndangducbn.startspringboot.controller;

import com.ndangducbn.startspringboot.bean.Student;
import com.ndangducbn.startspringboot.model.CreateStudentRq;
import com.ndangducbn.startspringboot.model.DetailStudentRq;
import com.ndangducbn.startspringboot.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public String createStudent(@RequestBody CreateStudentRq request) {
        Student student = new Student();
        BeanUtils.copyProperties(request, student);
        this.service.createStudent(student);
        return "Create OK";
    }

    @PostMapping(value = "/detail", produces = MediaType.APPLICATION_JSON_VALUE)
    public Student detailStudent(@RequestBody DetailStudentRq request) {
        return this.service.queryStudentBySno(request.getSno());
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAll() {
        return this.service.getAll();
    }
}
