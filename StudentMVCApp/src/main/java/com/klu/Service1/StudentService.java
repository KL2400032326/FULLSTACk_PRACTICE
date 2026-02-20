package com.klu.Service1;

import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.Model.Student;

public interface StudentService {
   String getWelcomeMessage();
   Student createStudent(Student student);
   Student getStudentById(int id);
   List<Student> getAllStudents();
   Student updateStudent(int id,Student student);
   String deleteStudent(int id);
   List<Student> searchStudent(String name,String course);
}
