package studentportal.controller;

import studentportal.controller.StudentManager;
import studentportal.model.DataSource;
import studentportal.model.Student;

import java.util.List;

public class StudentManagerImpl implements StudentManager {

    private final DataSource dataSource;

    public StudentManagerImpl(DataSource dataSource) {
        if(dataSource == null) {
            throw new IllegalArgumentException();
        }
        this.dataSource = dataSource;
    }

    @Override
    public void addStudent(Student student) {
        if(student == null) {
            throw new IllegalArgumentException();
        }
        dataSource.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return dataSource.getAllStudents();
    }
}
