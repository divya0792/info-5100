package PartC;

import org.junit.Test;

public class AnimalHospital {
    @Test
    public void testDog() {
        //Arrange
        Dog dog = new Dog("Boogie", "divu", "brown", "short");
        dog.setSex(1);
        dog.setBoardStart(2,7,2018);
        dog.setBoardEnd(2,10,2018);
        System.out.println(dog.toString());
        System.out.print(dog.boarding(2,8,2018));

    }

    @Test
    public void testCat() {
        //Arrange
        Cat cat = new Cat("meow", "divu", "white", "short");
        cat.setSex(1);
        cat.setBoardStart(2,4,2018);
        cat.setBoardEnd(2,10,2018);
        System.out.println(cat.toString());
        System.out.print(cat.boarding(2,12,2018));

    }
}
