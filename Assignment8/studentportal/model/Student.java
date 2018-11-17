package studentportal.model;

import java.io.Serializable;

public class Student implements Serializable {

    private final long id;
    private final String name;
    private final Gender gender;
    private final String email;

    public Student(long id, String name, Gender gender, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email= email;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
