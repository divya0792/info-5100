package CourseRegistration;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CourseTest {

    private Student[] students;

    private Course registerStudents(int numberOfStudents) {
        Course course = new Course("Application Development");
        String name = "john";
        students = new Student[numberOfStudents];
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student(i, name + i);
        }
        for(Student student : students) {
            course.registerStudent(student);
        }
        return course;
    }

    @Test
    public void registerStudent() {
        Course course = registerStudents(10);
        assertEquals(course.getNumberOfStudents(), 10);
        assertArrayEquals(course.getStudentsRegistered(), students);
    }

    @Test(expected = IllegalStateException.class)
    public void courseFull() {
        registerStudents(11);
    }
}
