package PartC;

import java.util.Date;

public class Dog extends Pet implements Boardable {
    private final String size;
    private Date boardStart;
    private Date boardEnd;

    Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        if(size == null) {
            throw new IllegalArgumentException("args cant be null");
        }
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ":\n" + super.toString() + "\nsize : " + getSize();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.boardStart = new Date(year, month, day);
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.boardEnd = new Date(year, month, day);
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        Date date = new Date(year, month, day);
        if(this.boardStart == null) {
            throw new IllegalStateException("pet has never been hospitaliszed");
        }

        return (date.compareTo(this.boardStart) > 0 && date.compareTo(this.boardEnd) < 0);
    }
}
