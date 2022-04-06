package com.example.demo.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Transient;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long id) {
        try{
            return this.studentRepository.findById(id);
        } catch(NoSuchElementException e){
            return null;
        }
    }

    public Student createStudent(Student request){
        return this.studentRepository.save(request);
    }

    @Transient
    public Student updateStudent(Student request){
        Student student = this.studentRepository.findById(request.getId()).get();
        student.setName(request.getName());
        student.setEmail(request.getEmail());

        return student;
    }
}
