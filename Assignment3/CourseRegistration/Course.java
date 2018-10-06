package CourseRegistration;

public class Course {

    private final String name;
    private int numberOfStudents;
    private final Student[] studentsRegistered;
    private static final int MAX_LIMIT = 10;

    Course(String name) {
        this.name = name;
        this.studentsRegistered = new Student[MAX_LIMIT];
        this.numberOfStudents = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Student[] getStudentsRegistered() {
        return studentsRegistered;
    }

    public boolean isFull() {
        return numberOfStudents == MAX_LIMIT;
    }

    public void registerStudent(Student student) {
        if(student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }
        if(isFull()) {
            throw new IllegalStateException("All the seats of " + getName() + " are occupied");
        }
        studentsRegistered[numberOfStudents] = student;
        numberOfStudents++;
    }
}
