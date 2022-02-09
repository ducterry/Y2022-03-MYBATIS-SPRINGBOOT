package com.ndangducbn.startspringboot.service;

import com.ndangducbn.startspringboot.bean.Student;

import java.util.List;

public interface StudentService {
    public int createStudent(Student request);

    public Student updateStudent(Student request);

    public int deleteStudentBySno(String sno);

    public Student queryStudentBySno(String sno);

    public List<Student> getAll();
}
