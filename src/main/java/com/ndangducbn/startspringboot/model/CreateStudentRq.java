package com.ndangducbn.startspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentRq {
    private String sno;
    private String name;
    private String sex;
}
