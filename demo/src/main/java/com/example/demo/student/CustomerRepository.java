package com.example.demo.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository
        extends JpaRepository<Student,Integer> {

    static void findStudentByEmail(String email) {

    }
}
