package studentportal.model;

import java.util.List;

public interface DataSource {

    public boolean save(Student student);

    public List<Student> getAllStudents();
}
