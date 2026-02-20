package com.klu.Service1.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.klu.Model.Student;
import com.klu.Service1.StudentService;

@Service
public  class StudentServiceImpl implements StudentService{
private List<Student> studentList = new ArrayList<>();//we need to change private Studentrepo studentrepo we need to  extends from predefined JpaRepository this are used connect DataBase we need add dependency my sqlDriver
@Override
public String getWelcomeMessage() {
	return "Wellcome to student project";
}
@Override
public Student createStudent(Student student) {
	studentList.add(student);
	return student;
}

@Override
public Student getStudentById(int id) {
	for(Student s: studentList) {
		if(s.getId()==id) {
			return s;
		}
	}
	return null;
}

@Override
public List<Student> getAllStudents(){
	return studentList;
}
@Override
public  Student updateStudent(int id,Student student)
 {
	
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getId()==id) {
				student.setId(id);
				studentList.set(i, student);
			return student;
		}
	}
	return null;
}
@Override
public String deleteStudent(int id) {
	for(Student s: studentList) {
		if(s.getId()==id) {
			studentList.remove(s);
			return "Student with"+id+"No longer their he is removed";
		}
	}
	return "Student with"+id+"not their";
}
@Override
public List<Student> searchStudent(String name,String course){
	List<Student> result=new ArrayList<>();
	for(Student s:studentList) {
		
		if(s.getName().equalsIgnoreCase(name) && s.getCourse().equalsIgnoreCase(course) ) {
			result.add(s);
		}
	}
	return result;
}
}
