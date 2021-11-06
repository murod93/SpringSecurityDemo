package com.murodjon.SepringSecurityDemo.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@AllArgsConstructor
public class Student {
    private final Integer studentId;
    private final String studentName;
}
