package PartA;

import java.util.ArrayList;
import java.util.List;

public class Mreview implements Comparable<Mreview>{
    private final String title;
    private final List<Integer> ratings;
    private static final int MAX_RATING = 5;
    private static final int MIN_RATING = 0;

    Mreview() {
        this.title = "";
        this.ratings = new ArrayList<>();
    }

    Mreview(String title) {
        if(title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        this.title = title;
        this.ratings = new ArrayList<>();
    }

    Mreview(String title, int firstRating) {
        if(title == null) {
            throw new IllegalArgumentException("Title cannot be null");
        }
        if(firstRating < MIN_RATING || firstRating > MAX_RATING) {
            throw new IllegalArgumentException("invalid rating");
        }
        this.title = title;
        this.ratings = new ArrayList<>();
        this.ratings.add(firstRating);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Mreview o) {
        if(o == null) {
            throw new IllegalArgumentException("object to compare canno be null");
        }
        return this.title.compareTo(o.title);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            throw new IllegalArgumentException("object cannot be null");
        }
        if(obj instanceof Mreview) {
            Mreview mreview = (Mreview) obj;
            return this.title.equals(mreview.getTitle());
        }
        return false;
    }

    @Override
    public String toString() {
        return getTitle() + ", average " + aveRating() + " out of " + numRatings() + " ratings";
    }

    public void addRating(int rating) {
        if(rating < MIN_RATING || rating > MAX_RATING) {
            throw new IllegalArgumentException("invalid rating");
        }
        this.ratings.add(rating);
    }

    public double aveRating() {
        int sum = 0;
        for(int rating : ratings) {
            sum += rating;
        }
        return sum / (double) ratings.size();
    }

    public int numRatings() {
        return ratings.size();
    }

}
