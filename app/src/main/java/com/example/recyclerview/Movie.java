package com.example.recyclerview;

public class Movie {
    private final String year;
    private final GenderMovie gender;
    private final String title;

    public Movie(String year, GenderMovie gender, String title) {
        this.year = year;
        this.gender = gender;
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public GenderMovie getGender() {
        return gender;
    }

    public String getTitle() {
        return title;
    }
}
