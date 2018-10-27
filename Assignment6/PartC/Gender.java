package PartC;

public enum Gender {
    MALE( 1, "Male"),
    FEMALE( 2, "Female"),
    NEUTERED( 3, "Neutered"),
    SPAYED( 4, "Spayed");

    private final int key;
    private final String value;

    Gender(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getValue(int key) {
        return value;
    }

}
