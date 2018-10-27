package PartC;

import java.util.Date;

public class Cat extends Pet implements Boardable {
    private final String hairLength;
    private Date boardStart;
    private Date boardEnd;

    Cat(String name, String ownerName, String color, String hairLength) {
        super(name, ownerName, color);
        if(hairLength == null) {
            throw new IllegalArgumentException("args cant be null");
        }
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ":\n" + super.toString() + "\nhair : " + getHairLength();
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

        return (date.compareTo(this.boardStart) > 0 && date.compareTo(this.boardEnd) < 0);
    }
}
