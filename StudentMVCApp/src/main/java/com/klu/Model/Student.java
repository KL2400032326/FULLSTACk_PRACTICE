package com.klu.Model;
@Entity
public class Student {
private int Id;
private String Name;
private String Course;
public Student() {
	
}
public Student(int Id, String Name, String Course) {
	this.Id=Id;
	this.Name=Name;
	this.Course=Course;
}
public int getId() { 
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}

public void setName(String name) {
	Name = name;
}
public String getName() {
	
	return Name;
}

}
