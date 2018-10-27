package PartC;

import java.util.HashMap;
import java.util.Map;

public class Pet {

    private final String name;
    private final String ownerName;
    private final String color;
    private int sex;
    private static Map<Integer, String> gender;

    private void initializeGender() {
        if(gender == null) {
            gender = new HashMap<>();
            gender.put(1, "Male");
            gender.put(2, "Female");
            gender.put(3, "Spayed");
            gender.put(4, "Neutered");
        }
    }

    Pet(String name, String ownerName, String color) {
        if(name == null || ownerName == null || color == null) {
            throw new IllegalArgumentException("args cant be null");
        }
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
        initializeGender();
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSex() {
        return gender.get(this.sex);
    }

    @Override
    public String toString() {
        return this.name + " owned by " + this.ownerName + "\n" + "Color: "
                + this.color + "\n" + "sex : " + gender.get(this.sex);
    }
}
