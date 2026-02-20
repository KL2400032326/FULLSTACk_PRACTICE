package com.klu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.Model.Student;
import com.klu.Service1.StudentService;

@RestController
@RequestMapping("/Api")
public class StudentController {
@Autowired
private StudentService studentService;
@GetMapping("/Greet")
public String getWelcomeMessage() {
	return studentService.getWelcomeMessage();
}
@GetMapping("/Id/{id}")
public Student getStudentById(@PathVariable int id) {
	return studentService.getStudentById(id);
}
@GetMapping("/NameCourse/search")
public List<Student> searchStudent(@RequestParam String name,@RequestParam String course) {
	return studentService.searchStudent(name, course);
}
@GetMapping("/Createstudent")
public Student createStudent(@RequestBody Student student) {
	return studentService.createStudent(student);
}
@GetMapping("/getall")
public List<Student> getAllStudents(){
	return studentService.getAllStudents();
}
@GetMapping("/Update/{id}")
public Student updateStudent(@PathVariable int id,Student student) {
	return studentService.updateStudent(id, student);
}
@GetMapping("/Delete/{id}")
String deleteStudent(@PathVariable int id) {
	return studentService.deleteStudent(id);
}


}
