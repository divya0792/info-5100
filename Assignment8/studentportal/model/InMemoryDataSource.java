package studentportal.model;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDataSource implements DataSource {

    private final List<Student> students;

    public InMemoryDataSource(){
        this.students = new ArrayList<>();
    }

    InMemoryDataSource(List<Student> students) {
        this.students = students;
    }


    @Override
    public boolean save(Student student) {
        return students.add(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }
}
