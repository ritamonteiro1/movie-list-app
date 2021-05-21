package com.example.recyclerview;

public enum GenderMovie {
    COMEDY("Comédia"),
    HORROR("Horror"),
    ROMANTIC("Romântico"),
    ADVENTURE("Aventura"),
    SCIENCE_FICTION("Ficção Científica"),
    BASED_ON_REAL_FACTS("Baseado em fatos reais");

    private final String value;

    GenderMovie(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
