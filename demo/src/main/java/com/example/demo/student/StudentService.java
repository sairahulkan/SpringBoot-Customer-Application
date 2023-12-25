package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private final CustomerRepository customerRepository;
    public StudentService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Student> getStudents() {
        return customerRepository.findAll();
    }
    public void putCustomer (Student student)
    {
        customerRepository.save(student);
    }

    public void addNewStudent(Student student) {
        //System.out.println(student);
        CustomerRepository.findStudentByEmail(student.getEmail());
    }
}
