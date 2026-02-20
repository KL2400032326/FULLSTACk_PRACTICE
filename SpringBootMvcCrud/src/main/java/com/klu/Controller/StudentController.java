package com.klu.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.Studentservice;

@RestController
@RequestMapping("/Api")
public class StudentController {

    @Autowired
    private Studentservice studentService;

    @GetMapping("/greet")
    public String getWelcomeMessage() {
        return studentService.getWelcomeMessage();
    }

    @GetMapping("/id/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/search")
    public List<Student> searchStudent(@RequestParam String name, @RequestParam String course) {
        return studentService.searchStudent(name, course);
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student)
 {
        return studentService.createStudent(student);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        return studentService.deleteStudent(id);
    }
}
