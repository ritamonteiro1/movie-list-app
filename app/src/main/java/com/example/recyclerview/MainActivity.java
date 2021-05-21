package com.example.recyclerview;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        List<Movie> movieList = createMovies();
        MovieListAdapter movieListAdapter = new MovieListAdapter(movieList);
        setupRecyclerView(movieListAdapter);
    }

    private void setupRecyclerView(MovieListAdapter movieListAdapter) {
        mainRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mainRecyclerView.setAdapter(movieListAdapter);
    }

    private List<Movie> createMovies() {
        List<Movie> movieList = new ArrayList<>();
        Movie movie = new Movie("2021", GenderMovie.ADVENTURE, "Mulher Maravilha");
        movieList.add(movie);
        movie = new Movie("2020", GenderMovie.HORROR, "Invocação do mal");
        movieList.add(movie);
        movie = new Movie("2002", GenderMovie.ADVENTURE, "Homem Aranha");
        movieList.add(movie);
        movie = new Movie("2020", GenderMovie.ADVENTURE, "Jumanji");
        movieList.add(movie);
        movie = new Movie("2019", GenderMovie.ADVENTURE, "As aventuras de PI");
        movieList.add(movie);
        movie = new Movie("2018", GenderMovie.BASED_ON_REAL_FACTS, "A teoria de tudo");
        movieList.add(movie);
        movie = new Movie("2017", GenderMovie.SCIENCE_FICTION, "Avatar");
        movieList.add(movie);
        movie = new Movie("2017", GenderMovie.ROMANTIC, "Simplesmente acontece");
        movieList.add(movie);
        movie = new Movie("2021", GenderMovie.SCIENCE_FICTION, "Homem de Ferro");
        movieList.add(movie);
        movie = new Movie("2021", GenderMovie.COMEDY, "As branquelas");
        movieList.add(movie);
        return movieList;
    }
}