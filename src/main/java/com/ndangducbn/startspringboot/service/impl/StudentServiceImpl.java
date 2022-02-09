package com.ndangducbn.startspringboot.service.impl;

import com.ndangducbn.startspringboot.bean.Student;
import com.ndangducbn.startspringboot.mapper.StudentMapper;
import com.ndangducbn.startspringboot.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int createStudent(Student request) {
        return this.studentMapper.createStudent(request);
    }

    @Override
    public Student updateStudent(Student request) {
        return null;
    }

    @Override
    public int deleteStudentBySno(String sno) {
        return this.studentMapper.deleteStudentBySno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }

    @Override
    public List<Student> getAll() {
        return this.studentMapper.getAll();
    }
}
