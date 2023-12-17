package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        123L,
                        "Rahul",
                        "sairahulkan@gmaill.com",
                        LocalDate.of(1997, Month.JUNE, 5),
                        26
                )
        );
    }
}
