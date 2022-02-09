package com.ndangducbn.startspringboot.mapper;

import com.ndangducbn.startspringboot.bean.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO STUDENT(SNO,SNAME,SSEX) VALUES (#{sno},#{name},#{sex})")
    public int createStudent(Student request);

    public Student updateStudent(Student request);

    @Delete("DELETE FROM STUDENT ST WHERE ST.SNO =#{sno}")
    public int deleteStudentBySno(String sno);

    @Select("SELECT * FROM STUDENT ST WHERE ST.SNO=#{sno}")
    @Results(id = "student", value = {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)})
    public Student queryStudentBySno(String sno);


    @Select("SELECT * FROM STUDENT")
    @Results(value = {
            @Result(property = "sno", column = "sno", javaType = String.class),
            @Result(property = "name", column = "sname", javaType = String.class),
            @Result(property = "sex", column = "ssex", javaType = String.class)})
    public List<Student> getAll();
}
