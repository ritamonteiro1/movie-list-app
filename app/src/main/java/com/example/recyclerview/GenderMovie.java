package com.example.recyclerview;

public enum GenderMovie {
    COMEDY("Comédia"),
    HORROR("Horror"),
    ROMANTIC("Romântico"),
    ADVENTURE("Aventura"),
    SCIENCE_FICTION("Ficção Científica"),
    BASED_ON_REAL_FACTS("Baseado em fatos reais");

    private final String gender;

    GenderMovie(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
