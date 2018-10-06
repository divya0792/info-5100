package CourseRegistration;

public class CourseRegistration {

    public static void main(String[] args) {
        Course course = new Course("Application Dev");
        String name = "john";
        Student[] students = new Student[11];
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student(i, name + i);
        }
        for(Student student : students) {
            course.registerStudent(student);
        }
    }
}
