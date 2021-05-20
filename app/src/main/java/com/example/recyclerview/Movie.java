package com.example.recyclerview;

public class Movie {
    private String year;
    private String gender;
    private String title;

    public Movie(){
    }

    public Movie(String year, String gender, String title) {
        this.year = year;
        this.gender = gender;
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
