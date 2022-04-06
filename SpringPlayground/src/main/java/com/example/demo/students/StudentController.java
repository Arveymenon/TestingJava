package com.example.demo.students;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path="getAll")
    public List<Student> getAllStudent(){
        return this.studentService.getAllStudents();
    }

    @GetMapping(path="get", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public StudentResponse getStudent(@RequestParam(name= "id", required = true) Long id ) {
        Optional<Student> student = this.studentService.getStudent(id);
        System.out.println(student.toString());
        if (student.isPresent()) {
            return new StudentResponse(
                    true,
                    student.get());
        } else {
            return new StudentResponse(
                    false,
                    "Invalid ID: Id does not exist"
            );
        }
    }

    @PostMapping(path="create")
    @ResponseBody
    public String createStudent(@RequestBody Map<String, String> body) {

        Student student = new Student();
        try{
            student
                    .setName(body.get("name"))
                    .setStandard(Integer.parseInt(body.get("standard")))
                    .setDivision(DivisionEnum.valueOf(body.get("division")));
            this.studentService.createStudent(student);
        } catch (Exception e) {
            return new StudentResponse(
                    false,
                    student.toJSON()
            ).toString();
        }

        return new StudentResponse(
                true,
                "Oops invalid ID"
        ).toString();
    }
}

class StudentResponse implements Serializable {

    Student student = null;
    Boolean IsSuccess = false;
    String message = "";

    public StudentResponse(boolean isSuccess, Student student) {
        IsSuccess = isSuccess;
        this.student = student;
    }

    public StudentResponse(boolean isSuccess, String message) {
        IsSuccess = isSuccess;
        this.message = message;
    }

    public String createResponse(boolean isSuccess, String student) {
        return new String(
        "{" +
                "'isSuccess': " + isSuccess +
                ", 'response': " + student +
                "}"
        );
    }
}