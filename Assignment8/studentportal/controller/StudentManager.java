package studentportal.controller;

import studentportal.model.Student;

import java.util.List;

public interface StudentManager {

     void addStudent(Student student);

     List<Student> getAllStudents();
}
